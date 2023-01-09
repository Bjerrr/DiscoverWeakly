
package com.dw.DW.GENERATED_POJOS.JsonTrip;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "TechnicalMessage"
})
@Generated("jsonschema2pojo")
public class TechnicalMessages {

    @SerializedName("TechnicalMessage")
    private List<TechnicalMessage> technicalMessage = new ArrayList<TechnicalMessage>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TechnicalMessages() {
    }

    /**
     * 
     * @param technicalMessage
     */
    public TechnicalMessages(List<TechnicalMessage> technicalMessage) {
        super();
        this.technicalMessage = technicalMessage;
    }

    @SerializedName("TechnicalMessage")
    public List<TechnicalMessage> getTechnicalMessage() {
        return technicalMessage;
    }

    @SerializedName("TechnicalMessage")
    public void setTechnicalMessage(List<TechnicalMessage> technicalMessage) {
        this.technicalMessage = technicalMessage;
    }

    public TechnicalMessages withTechnicalMessage(List<TechnicalMessage> technicalMessage) {
        this.technicalMessage = technicalMessage;
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

    public TechnicalMessages withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TechnicalMessages.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("technicalMessage");
        sb.append('=');
        sb.append(((this.technicalMessage == null)?"<null>":this.technicalMessage));
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
        result = ((result* 31)+((this.technicalMessage == null)? 0 :this.technicalMessage.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TechnicalMessages) == false) {
            return false;
        }
        TechnicalMessages rhs = ((TechnicalMessages) other);
        return (((this.technicalMessage == rhs.technicalMessage)||((this.technicalMessage!= null)&&this.technicalMessage.equals(rhs.technicalMessage)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
