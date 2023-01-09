
package com.dw.DW.GENERATED_POJOS.Recommendations;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "initialPoolSize",
    "afterFilteringSize",
    "afterRelinkingSize",
    "id",
    "type",
    "href"
})
@Generated("jsonschema2pojo")
public class Seed {

    @SerializedName("initialPoolSize")
    private Integer initialPoolSize;
    @SerializedName("afterFilteringSize")
    private Integer afterFilteringSize;
    @SerializedName("afterRelinkingSize")
    private Integer afterRelinkingSize;
    @SerializedName("id")
    private String id;
    @SerializedName("type")
    private String type;
    @SerializedName("href")
    private Object href;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Seed() {
    }

    /**
     * 
     * @param id
     * @param href
     * @param type
     * @param initialPoolSize
     * @param afterRelinkingSize
     * @param afterFilteringSize
     */
    public Seed(Integer initialPoolSize, Integer afterFilteringSize, Integer afterRelinkingSize, String id, String type, Object href) {
        super();
        this.initialPoolSize = initialPoolSize;
        this.afterFilteringSize = afterFilteringSize;
        this.afterRelinkingSize = afterRelinkingSize;
        this.id = id;
        this.type = type;
        this.href = href;
    }

    @SerializedName("initialPoolSize")
    public Integer getInitialPoolSize() {
        return initialPoolSize;
    }

    @SerializedName("initialPoolSize")
    public void setInitialPoolSize(Integer initialPoolSize) {
        this.initialPoolSize = initialPoolSize;
    }

    public Seed withInitialPoolSize(Integer initialPoolSize) {
        this.initialPoolSize = initialPoolSize;
        return this;
    }

    @SerializedName("afterFilteringSize")
    public Integer getAfterFilteringSize() {
        return afterFilteringSize;
    }

    @SerializedName("afterFilteringSize")
    public void setAfterFilteringSize(Integer afterFilteringSize) {
        this.afterFilteringSize = afterFilteringSize;
    }

    public Seed withAfterFilteringSize(Integer afterFilteringSize) {
        this.afterFilteringSize = afterFilteringSize;
        return this;
    }

    @SerializedName("afterRelinkingSize")
    public Integer getAfterRelinkingSize() {
        return afterRelinkingSize;
    }

    @SerializedName("afterRelinkingSize")
    public void setAfterRelinkingSize(Integer afterRelinkingSize) {
        this.afterRelinkingSize = afterRelinkingSize;
    }

    public Seed withAfterRelinkingSize(Integer afterRelinkingSize) {
        this.afterRelinkingSize = afterRelinkingSize;
        return this;
    }

    @SerializedName("id")
    public String getId() {
        return id;
    }

    @SerializedName("id")
    public void setId(String id) {
        this.id = id;
    }

    public Seed withId(String id) {
        this.id = id;
        return this;
    }

    @SerializedName("type")
    public String getType() {
        return type;
    }

    @SerializedName("type")
    public void setType(String type) {
        this.type = type;
    }

    public Seed withType(String type) {
        this.type = type;
        return this;
    }

    @SerializedName("href")
    public Object getHref() {
        return href;
    }

    @SerializedName("href")
    public void setHref(Object href) {
        this.href = href;
    }

    public Seed withHref(Object href) {
        this.href = href;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Seed withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Seed.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("initialPoolSize");
        sb.append('=');
        sb.append(((this.initialPoolSize == null)?"<null>":this.initialPoolSize));
        sb.append(',');
        sb.append("afterFilteringSize");
        sb.append('=');
        sb.append(((this.afterFilteringSize == null)?"<null>":this.afterFilteringSize));
        sb.append(',');
        sb.append("afterRelinkingSize");
        sb.append('=');
        sb.append(((this.afterRelinkingSize == null)?"<null>":this.afterRelinkingSize));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.initialPoolSize == null)? 0 :this.initialPoolSize.hashCode()));
        result = ((result* 31)+((this.afterRelinkingSize == null)? 0 :this.afterRelinkingSize.hashCode()));
        result = ((result* 31)+((this.afterFilteringSize == null)? 0 :this.afterFilteringSize.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Seed) == false) {
            return false;
        }
        Seed rhs = ((Seed) other);
        return ((((((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.initialPoolSize == rhs.initialPoolSize)||((this.initialPoolSize!= null)&&this.initialPoolSize.equals(rhs.initialPoolSize))))&&((this.afterRelinkingSize == rhs.afterRelinkingSize)||((this.afterRelinkingSize!= null)&&this.afterRelinkingSize.equals(rhs.afterRelinkingSize))))&&((this.afterFilteringSize == rhs.afterFilteringSize)||((this.afterFilteringSize!= null)&&this.afterFilteringSize.equals(rhs.afterFilteringSize))));
    }

}
