
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
    "name",
    "type",
    "id",
    "extId",
    "lon",
    "lat",
    "routeIdx",
    "prognosisType",
    "time",
    "date"
})
@Generated("jsonschema2pojo")
public class Destination__1 {

    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("id")
    private String id;
    @SerializedName("extId")
    private String extId;
    @SerializedName("lon")
    private Double lon;
    @SerializedName("lat")
    private Double lat;
    @SerializedName("routeIdx")
    private Integer routeIdx;
    @SerializedName("prognosisType")
    private String prognosisType;
    @SerializedName("time")
    private String time;
    @SerializedName("date")
    private String date;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Destination__1() {
    }

    /**
     * 
     * @param date
     * @param routeIdx
     * @param name
     * @param prognosisType
     * @param lon
     * @param id
     * @param extId
     * @param time
     * @param type
     * @param lat
     */
    public Destination__1(String name, String type, String id, String extId, Double lon, Double lat, Integer routeIdx, String prognosisType, String time, String date) {
        super();
        this.name = name;
        this.type = type;
        this.id = id;
        this.extId = extId;
        this.lon = lon;
        this.lat = lat;
        this.routeIdx = routeIdx;
        this.prognosisType = prognosisType;
        this.time = time;
        this.date = date;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    public Destination__1 withName(String name) {
        this.name = name;
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

    public Destination__1 withType(String type) {
        this.type = type;
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

    public Destination__1 withId(String id) {
        this.id = id;
        return this;
    }

    @SerializedName("extId")
    public String getExtId() {
        return extId;
    }

    @SerializedName("extId")
    public void setExtId(String extId) {
        this.extId = extId;
    }

    public Destination__1 withExtId(String extId) {
        this.extId = extId;
        return this;
    }

    @SerializedName("lon")
    public Double getLon() {
        return lon;
    }

    @SerializedName("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Destination__1 withLon(Double lon) {
        this.lon = lon;
        return this;
    }

    @SerializedName("lat")
    public Double getLat() {
        return lat;
    }

    @SerializedName("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Destination__1 withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    @SerializedName("routeIdx")
    public Integer getRouteIdx() {
        return routeIdx;
    }

    @SerializedName("routeIdx")
    public void setRouteIdx(Integer routeIdx) {
        this.routeIdx = routeIdx;
    }

    public Destination__1 withRouteIdx(Integer routeIdx) {
        this.routeIdx = routeIdx;
        return this;
    }

    @SerializedName("prognosisType")
    public String getPrognosisType() {
        return prognosisType;
    }

    @SerializedName("prognosisType")
    public void setPrognosisType(String prognosisType) {
        this.prognosisType = prognosisType;
    }

    public Destination__1 withPrognosisType(String prognosisType) {
        this.prognosisType = prognosisType;
        return this;
    }

    @SerializedName("time")
    public String getTime() {
        return time;
    }

    @SerializedName("time")
    public void setTime(String time) {
        this.time = time;
    }

    public Destination__1 withTime(String time) {
        this.time = time;
        return this;
    }

    @SerializedName("date")
    public String getDate() {
        return date;
    }

    @SerializedName("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Destination__1 withDate(String date) {
        this.date = date;
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

    public Destination__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Destination__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extId");
        sb.append('=');
        sb.append(((this.extId == null)?"<null>":this.extId));
        sb.append(',');
        sb.append("lon");
        sb.append('=');
        sb.append(((this.lon == null)?"<null>":this.lon));
        sb.append(',');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');
        sb.append("routeIdx");
        sb.append('=');
        sb.append(((this.routeIdx == null)?"<null>":this.routeIdx));
        sb.append(',');
        sb.append("prognosisType");
        sb.append('=');
        sb.append(((this.prognosisType == null)?"<null>":this.prognosisType));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.routeIdx == null)? 0 :this.routeIdx.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.prognosisType == null)? 0 :this.prognosisType.hashCode()));
        result = ((result* 31)+((this.lon == null)? 0 :this.lon.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.extId == null)? 0 :this.extId.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Destination__1) == false) {
            return false;
        }
        Destination__1 rhs = ((Destination__1) other);
        return ((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.routeIdx == rhs.routeIdx)||((this.routeIdx!= null)&&this.routeIdx.equals(rhs.routeIdx))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.prognosisType == rhs.prognosisType)||((this.prognosisType!= null)&&this.prognosisType.equals(rhs.prognosisType))))&&((this.lon == rhs.lon)||((this.lon!= null)&&this.lon.equals(rhs.lon))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.extId == rhs.extId)||((this.extId!= null)&&this.extId.equals(rhs.extId))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))));
    }

}
