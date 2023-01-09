
package com.dw.DW.GENERATED_POJOS.JsonTrip;

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
    "ref"
})
@Generated("jsonschema2pojo")
public class JourneyDetailRef {

    @SerializedName("ref")
    private String ref;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JourneyDetailRef() {
    }

    /**
     * 
     * @param ref
     */
    public JourneyDetailRef(String ref) {
        super();
        this.ref = ref;
    }

    @SerializedName("ref")
    public String getRef() {
        return ref;
    }

    @SerializedName("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    public JourneyDetailRef withRef(String ref) {
        this.ref = ref;
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

    public JourneyDetailRef withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JourneyDetailRef.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ref");
        sb.append('=');
        sb.append(((this.ref == null)?"<null>":this.ref));
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
        result = ((result* 31)+((this.ref == null)? 0 :this.ref.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JourneyDetailRef) == false) {
            return false;
        }
        JourneyDetailRef rhs = ((JourneyDetailRef) other);
        return (((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
