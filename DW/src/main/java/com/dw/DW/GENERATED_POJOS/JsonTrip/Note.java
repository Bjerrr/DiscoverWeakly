
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
    "key",
    "type",
    "routeIdxFrom",
    "routeIdxTo",
    "txtN"
})
@Generated("jsonschema2pojo")
public class Note {

    @SerializedName("value")
    private String value;
    @SerializedName("key")
    private String key;
    @SerializedName("type")
    private String type;
    @SerializedName("routeIdxFrom")
    private Integer routeIdxFrom;
    @SerializedName("routeIdxTo")
    private Integer routeIdxTo;
    @SerializedName("txtN")
    private String txtN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Note() {
    }

    /**
     * 
     * @param routeIdxTo
     * @param routeIdxFrom
     * @param txtN
     * @param type
     * @param value
     * @param key
     */
    public Note(String value, String key, String type, Integer routeIdxFrom, Integer routeIdxTo, String txtN) {
        super();
        this.value = value;
        this.key = key;
        this.type = type;
        this.routeIdxFrom = routeIdxFrom;
        this.routeIdxTo = routeIdxTo;
        this.txtN = txtN;
    }

    @SerializedName("value")
    public String getValue() {
        return value;
    }

    @SerializedName("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Note withValue(String value) {
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

    public Note withKey(String key) {
        this.key = key;
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

    public Note withType(String type) {
        this.type = type;
        return this;
    }

    @SerializedName("routeIdxFrom")
    public Integer getRouteIdxFrom() {
        return routeIdxFrom;
    }

    @SerializedName("routeIdxFrom")
    public void setRouteIdxFrom(Integer routeIdxFrom) {
        this.routeIdxFrom = routeIdxFrom;
    }

    public Note withRouteIdxFrom(Integer routeIdxFrom) {
        this.routeIdxFrom = routeIdxFrom;
        return this;
    }

    @SerializedName("routeIdxTo")
    public Integer getRouteIdxTo() {
        return routeIdxTo;
    }

    @SerializedName("routeIdxTo")
    public void setRouteIdxTo(Integer routeIdxTo) {
        this.routeIdxTo = routeIdxTo;
    }

    public Note withRouteIdxTo(Integer routeIdxTo) {
        this.routeIdxTo = routeIdxTo;
        return this;
    }

    @SerializedName("txtN")
    public String getTxtN() {
        return txtN;
    }

    @SerializedName("txtN")
    public void setTxtN(String txtN) {
        this.txtN = txtN;
    }

    public Note withTxtN(String txtN) {
        this.txtN = txtN;
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

    public Note withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Note.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("routeIdxFrom");
        sb.append('=');
        sb.append(((this.routeIdxFrom == null)?"<null>":this.routeIdxFrom));
        sb.append(',');
        sb.append("routeIdxTo");
        sb.append('=');
        sb.append(((this.routeIdxTo == null)?"<null>":this.routeIdxTo));
        sb.append(',');
        sb.append("txtN");
        sb.append('=');
        sb.append(((this.txtN == null)?"<null>":this.txtN));
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
        result = ((result* 31)+((this.routeIdxTo == null)? 0 :this.routeIdxTo.hashCode()));
        result = ((result* 31)+((this.routeIdxFrom == null)? 0 :this.routeIdxFrom.hashCode()));
        result = ((result* 31)+((this.txtN == null)? 0 :this.txtN.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Note) == false) {
            return false;
        }
        Note rhs = ((Note) other);
        return ((((((((this.routeIdxTo == rhs.routeIdxTo)||((this.routeIdxTo!= null)&&this.routeIdxTo.equals(rhs.routeIdxTo)))&&((this.routeIdxFrom == rhs.routeIdxFrom)||((this.routeIdxFrom!= null)&&this.routeIdxFrom.equals(rhs.routeIdxFrom))))&&((this.txtN == rhs.txtN)||((this.txtN!= null)&&this.txtN.equals(rhs.txtN))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))));
    }

}
