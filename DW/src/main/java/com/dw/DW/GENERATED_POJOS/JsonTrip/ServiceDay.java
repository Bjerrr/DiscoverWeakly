
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
    "planningPeriodBegin",
    "planningPeriodEnd",
    "sDaysR",
    "sDaysB"
})
@Generated("jsonschema2pojo")
public class ServiceDay {

    @SerializedName("planningPeriodBegin")
    private String planningPeriodBegin;
    @SerializedName("planningPeriodEnd")
    private String planningPeriodEnd;
    @SerializedName("sDaysR")
    private String sDaysR;
    @SerializedName("sDaysB")
    private String sDaysB;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceDay() {
    }

    /**
     * 
     * @param planningPeriodEnd
     * @param sDaysR
     * @param sDaysB
     * @param planningPeriodBegin
     */
    public ServiceDay(String planningPeriodBegin, String planningPeriodEnd, String sDaysR, String sDaysB) {
        super();
        this.planningPeriodBegin = planningPeriodBegin;
        this.planningPeriodEnd = planningPeriodEnd;
        this.sDaysR = sDaysR;
        this.sDaysB = sDaysB;
    }

    @SerializedName("planningPeriodBegin")
    public String getPlanningPeriodBegin() {
        return planningPeriodBegin;
    }

    @SerializedName("planningPeriodBegin")
    public void setPlanningPeriodBegin(String planningPeriodBegin) {
        this.planningPeriodBegin = planningPeriodBegin;
    }

    public ServiceDay withPlanningPeriodBegin(String planningPeriodBegin) {
        this.planningPeriodBegin = planningPeriodBegin;
        return this;
    }

    @SerializedName("planningPeriodEnd")
    public String getPlanningPeriodEnd() {
        return planningPeriodEnd;
    }

    @SerializedName("planningPeriodEnd")
    public void setPlanningPeriodEnd(String planningPeriodEnd) {
        this.planningPeriodEnd = planningPeriodEnd;
    }

    public ServiceDay withPlanningPeriodEnd(String planningPeriodEnd) {
        this.planningPeriodEnd = planningPeriodEnd;
        return this;
    }

    @SerializedName("sDaysR")
    public String getsDaysR() {
        return sDaysR;
    }

    @SerializedName("sDaysR")
    public void setsDaysR(String sDaysR) {
        this.sDaysR = sDaysR;
    }

    public ServiceDay withsDaysR(String sDaysR) {
        this.sDaysR = sDaysR;
        return this;
    }

    @SerializedName("sDaysB")
    public String getsDaysB() {
        return sDaysB;
    }

    @SerializedName("sDaysB")
    public void setsDaysB(String sDaysB) {
        this.sDaysB = sDaysB;
    }

    public ServiceDay withsDaysB(String sDaysB) {
        this.sDaysB = sDaysB;
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

    public ServiceDay withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceDay.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("planningPeriodBegin");
        sb.append('=');
        sb.append(((this.planningPeriodBegin == null)?"<null>":this.planningPeriodBegin));
        sb.append(',');
        sb.append("planningPeriodEnd");
        sb.append('=');
        sb.append(((this.planningPeriodEnd == null)?"<null>":this.planningPeriodEnd));
        sb.append(',');
        sb.append("sDaysR");
        sb.append('=');
        sb.append(((this.sDaysR == null)?"<null>":this.sDaysR));
        sb.append(',');
        sb.append("sDaysB");
        sb.append('=');
        sb.append(((this.sDaysB == null)?"<null>":this.sDaysB));
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
        result = ((result* 31)+((this.planningPeriodEnd == null)? 0 :this.planningPeriodEnd.hashCode()));
        result = ((result* 31)+((this.sDaysR == null)? 0 :this.sDaysR.hashCode()));
        result = ((result* 31)+((this.sDaysB == null)? 0 :this.sDaysB.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.planningPeriodBegin == null)? 0 :this.planningPeriodBegin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceDay) == false) {
            return false;
        }
        ServiceDay rhs = ((ServiceDay) other);
        return ((((((this.planningPeriodEnd == rhs.planningPeriodEnd)||((this.planningPeriodEnd!= null)&&this.planningPeriodEnd.equals(rhs.planningPeriodEnd)))&&((this.sDaysR == rhs.sDaysR)||((this.sDaysR!= null)&&this.sDaysR.equals(rhs.sDaysR))))&&((this.sDaysB == rhs.sDaysB)||((this.sDaysB!= null)&&this.sDaysB.equals(rhs.sDaysB))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.planningPeriodBegin == rhs.planningPeriodBegin)||((this.planningPeriodBegin!= null)&&this.planningPeriodBegin.equals(rhs.planningPeriodBegin))));
    }

}
