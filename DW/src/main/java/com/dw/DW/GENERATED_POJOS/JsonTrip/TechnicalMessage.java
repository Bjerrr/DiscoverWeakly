
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
    "value",
    "key"
})
@Generated("jsonschema2pojo")
public class TechnicalMessage {

    @SerializedName("value")
    private String value;
    @SerializedName("key")
    private String key;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TechnicalMessage() {
    }

    /**
     * 
     * @param value
     * @param key
     */
    public TechnicalMessage(String value, String key) {
        super();
        this.value = value;
        this.key = key;
    }

    @SerializedName("value")
    public String getValue() {
        return value;
    }

    @SerializedName("value")
    public void setValue(String value) {
        this.value = value;
    }

    public TechnicalMessage withValue(String value) {
        this.value = value;
        return this;
    }

    @SerializedName("key")
    public String getKey() {
        return key;
    }

    @SerializedName("key")
    public void setKey(String key) {
        this.key = key;
    }

    public TechnicalMessage withKey(String key) {
        this.key = key;
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

    public TechnicalMessage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TechnicalMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TechnicalMessage) == false) {
            return false;
        }
        TechnicalMessage rhs = ((TechnicalMessage) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))));
    }

}
