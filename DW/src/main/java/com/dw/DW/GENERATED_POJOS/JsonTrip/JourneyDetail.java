
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
    "dayOfOperation",
    "ref"
})
@Generated("jsonschema2pojo")
public class JourneyDetail {

    @SerializedName("dayOfOperation")
    private String dayOfOperation;
    @SerializedName("ref")
    private String ref;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JourneyDetail() {
    }

    /**
     * 
     * @param ref
     * @param dayOfOperation
     */
    public JourneyDetail(String dayOfOperation, String ref) {
        super();
        this.dayOfOperation = dayOfOperation;
        this.ref = ref;
    }

    @SerializedName("dayOfOperation")
    public String getDayOfOperation() {
        return dayOfOperation;
    }

    @SerializedName("dayOfOperation")
    public void setDayOfOperation(String dayOfOperation) {
        this.dayOfOperation = dayOfOperation;
    }

    public JourneyDetail withDayOfOperation(String dayOfOperation) {
        this.dayOfOperation = dayOfOperation;
        return this;
    }

    @SerializedName("ref")
    public String getRef() {
        return ref;
    }

    @SerializedName("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    public JourneyDetail withRef(String ref) {
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

    public JourneyDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JourneyDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dayOfOperation");
        sb.append('=');
        sb.append(((this.dayOfOperation == null)?"<null>":this.dayOfOperation));
        sb.append(',');
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
        result = ((result* 31)+((this.dayOfOperation == null)? 0 :this.dayOfOperation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JourneyDetail) == false) {
            return false;
        }
        JourneyDetail rhs = ((JourneyDetail) other);
        return ((((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dayOfOperation == rhs.dayOfOperation)||((this.dayOfOperation!= null)&&this.dayOfOperation.equals(rhs.dayOfOperation))));
    }

}
