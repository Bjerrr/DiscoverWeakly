
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
    "hintCode",
    "daily"
})
@Generated("jsonschema2pojo")
public class TripStatus {

    @SerializedName("hintCode")
    private Integer hintCode;
    @SerializedName("daily")
    private Boolean daily;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TripStatus() {
    }

    /**
     * 
     * @param hintCode
     * @param daily
     */
    public TripStatus(Integer hintCode, Boolean daily) {
        super();
        this.hintCode = hintCode;
        this.daily = daily;
    }

    @SerializedName("hintCode")
    public Integer getHintCode() {
        return hintCode;
    }

    @SerializedName("hintCode")
    public void setHintCode(Integer hintCode) {
        this.hintCode = hintCode;
    }

    public TripStatus withHintCode(Integer hintCode) {
        this.hintCode = hintCode;
        return this;
    }

    @SerializedName("daily")
    public Boolean getDaily() {
        return daily;
    }

    @SerializedName("daily")
    public void setDaily(Boolean daily) {
        this.daily = daily;
    }

    public TripStatus withDaily(Boolean daily) {
        this.daily = daily;
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

    public TripStatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TripStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hintCode");
        sb.append('=');
        sb.append(((this.hintCode == null)?"<null>":this.hintCode));
        sb.append(',');
        sb.append("daily");
        sb.append('=');
        sb.append(((this.daily == null)?"<null>":this.daily));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hintCode == null)? 0 :this.hintCode.hashCode()));
        result = ((result* 31)+((this.daily == null)? 0 :this.daily.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TripStatus) == false) {
            return false;
        }
        TripStatus rhs = ((TripStatus) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.hintCode == rhs.hintCode)||((this.hintCode!= null)&&this.hintCode.equals(rhs.hintCode))))&&((this.daily == rhs.daily)||((this.daily!= null)&&this.daily.equals(rhs.daily))));
    }

}
