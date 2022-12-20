
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
    "timeDiffCritical"
})
@Generated("jsonschema2pojo")
public class ResultStatus {

    @SerializedName("timeDiffCritical")
    private Boolean timeDiffCritical;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResultStatus() {
    }

    /**
     * 
     * @param timeDiffCritical
     */
    public ResultStatus(Boolean timeDiffCritical) {
        super();
        this.timeDiffCritical = timeDiffCritical;
    }

    @SerializedName("timeDiffCritical")
    public Boolean getTimeDiffCritical() {
        return timeDiffCritical;
    }

    @SerializedName("timeDiffCritical")
    public void setTimeDiffCritical(Boolean timeDiffCritical) {
        this.timeDiffCritical = timeDiffCritical;
    }

    public ResultStatus withTimeDiffCritical(Boolean timeDiffCritical) {
        this.timeDiffCritical = timeDiffCritical;
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

    public ResultStatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResultStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeDiffCritical");
        sb.append('=');
        sb.append(((this.timeDiffCritical == null)?"<null>":this.timeDiffCritical));
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
        result = ((result* 31)+((this.timeDiffCritical == null)? 0 :this.timeDiffCritical.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResultStatus) == false) {
            return false;
        }
        ResultStatus rhs = ((ResultStatus) other);
        return (((this.timeDiffCritical == rhs.timeDiffCritical)||((this.timeDiffCritical!= null)&&this.timeDiffCritical.equals(rhs.timeDiffCritical)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
