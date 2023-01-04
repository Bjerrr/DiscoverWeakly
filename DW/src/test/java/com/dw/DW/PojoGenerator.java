package com.dw.DW;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Generates POJO's based on a .json file.
 * Java classes are placed in a specified package.
 *
 * NOTE: Generated classes are annotaded using Jackson-annotations.
 * To use gson all instances of "@JsonProperty(" must be replaced with "@SerializedName(".
 */
public class PojoGenerator {
    public static void main(String[] args) throws IOException {
        //GenerateClasses();
    }

    private static void GenerateClasses() throws IOException {
        String rawJson = ""; //new PlaylistBuilder().getJsonResponse();
        File targetDirectory = new File("DW/src/test/java/");
        String packageName = "com.dw.DW.GENERATED_POJOS";
        String className = "RecommendationsRoot";

        try {
            new PojoGenerator().generateClassFromRawJson(rawJson, targetDirectory, packageName, className);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void generateClassFromRawJson(String rawJson, File outputJavaClassDirectory, String packageName, String javaClassName)
            throws IOException {
        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public boolean isInitializeCollections() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }

            @Override
            public AnnotationStyle getAnnotationStyle() {
                return AnnotationStyle.GSON;
            }

            @Override
            public boolean isIncludeGeneratedAnnotation() {
                return true;
            }

            @Override
            public boolean isIncludeConstructors() {
                return true;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, javaClassName, packageName, rawJson);

        jcodeModel.build(outputJavaClassDirectory);
    }

    public void generateClassFromJsonURL(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName)
            throws IOException {
        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

        jcodeModel.build(outputJavaClassDirectory);
    }
}
