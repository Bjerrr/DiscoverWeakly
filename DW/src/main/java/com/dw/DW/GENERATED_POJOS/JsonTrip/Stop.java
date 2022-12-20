
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
    "id",
    "extId",
    "routeIdx",
    "lon",
    "lat",
    "depTime",
    "depDate",
    "depDir",
    "arrTime",
    "arrDate"
})
@Generated("jsonschema2pojo")
public class Stop {

    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private String id;
    @SerializedName("extId")
    private String extId;
    @SerializedName("routeIdx")
    private Integer routeIdx;
    @SerializedName("lon")
    private Double lon;
    @SerializedName("lat")
    private Double lat;
    @SerializedName("depTime")
    private String depTime;
    @SerializedName("depDate")
    private String depDate;
    @SerializedName("depDir")
    private String depDir;
    @SerializedName("arrTime")
    private String arrTime;
    @SerializedName("arrDate")
    private String arrDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stop() {
    }

    /**
     * 
     * @param arrDate
     * @param routeIdx
     * @param depTime
     * @param name
     * @param depDir
     * @param lon
     * @param id
     * @param extId
     * @param arrTime
     * @param lat
     * @param depDate
     */
    public Stop(String name, String id, String extId, Integer routeIdx, Double lon, Double lat, String depTime, String depDate, String depDir, String arrTime, String arrDate) {
        super();
        this.name = name;
        this.id = id;
        this.extId = extId;
        this.routeIdx = routeIdx;
        this.lon = lon;
        this.lat = lat;
        this.depTime = depTime;
        this.depDate = depDate;
        this.depDir = depDir;
        this.arrTime = arrTime;
        this.arrDate = arrDate;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    public Stop withName(String name) {
        this.name = name;
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

    public Stop withId(String id) {
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

    public Stop withExtId(String extId) {
        this.extId = extId;
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

    public Stop withRouteIdx(Integer routeIdx) {
        this.routeIdx = routeIdx;
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

    public Stop withLon(Double lon) {
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

    public Stop withLat(Double lat) {
        this.lat = lat;
        return this;
    }

    @SerializedName("depTime")
    public String getDepTime() {
        return depTime;
    }

    @SerializedName("depTime")
    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public Stop withDepTime(String depTime) {
        this.depTime = depTime;
        return this;
    }

    @SerializedName("depDate")
    public String getDepDate() {
        return depDate;
    }

    @SerializedName("depDate")
    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public Stop withDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }

    @SerializedName("depDir")
    public String getDepDir() {
        return depDir;
    }

    @SerializedName("depDir")
    public void setDepDir(String depDir) {
        this.depDir = depDir;
    }

    public Stop withDepDir(String depDir) {
        this.depDir = depDir;
        return this;
    }

    @SerializedName("arrTime")
    public String getArrTime() {
        return arrTime;
    }

    @SerializedName("arrTime")
    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public Stop withArrTime(String arrTime) {
        this.arrTime = arrTime;
        return this;
    }

    @SerializedName("arrDate")
    public String getArrDate() {
        return arrDate;
    }

    @SerializedName("arrDate")
    public void setArrDate(String arrDate) {
        this.arrDate = arrDate;
    }

    public Stop withArrDate(String arrDate) {
        this.arrDate = arrDate;
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

    public Stop withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stop.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extId");
        sb.append('=');
        sb.append(((this.extId == null)?"<null>":this.extId));
        sb.append(',');
        sb.append("routeIdx");
        sb.append('=');
        sb.append(((this.routeIdx == null)?"<null>":this.routeIdx));
        sb.append(',');
        sb.append("lon");
        sb.append('=');
        sb.append(((this.lon == null)?"<null>":this.lon));
        sb.append(',');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');
        sb.append("depTime");
        sb.append('=');
        sb.append(((this.depTime == null)?"<null>":this.depTime));
        sb.append(',');
        sb.append("depDate");
        sb.append('=');
        sb.append(((this.depDate == null)?"<null>":this.depDate));
        sb.append(',');
        sb.append("depDir");
        sb.append('=');
        sb.append(((this.depDir == null)?"<null>":this.depDir));
        sb.append(',');
        sb.append("arrTime");
        sb.append('=');
        sb.append(((this.arrTime == null)?"<null>":this.arrTime));
        sb.append(',');
        sb.append("arrDate");
        sb.append('=');
        sb.append(((this.arrDate == null)?"<null>":this.arrDate));
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
        result = ((result* 31)+((this.arrDate == null)? 0 :this.arrDate.hashCode()));
        result = ((result* 31)+((this.routeIdx == null)? 0 :this.routeIdx.hashCode()));
        result = ((result* 31)+((this.depTime == null)? 0 :this.depTime.hashCode()));
        result = ((result* 31)+((this.lon == null)? 0 :this.lon.hashCode()));
        result = ((result* 31)+((this.depDate == null)? 0 :this.depDate.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.depDir == null)? 0 :this.depDir.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.extId == null)? 0 :this.extId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.arrTime == null)? 0 :this.arrTime.hashCode()));
        result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stop) == false) {
            return false;
        }
        Stop rhs = ((Stop) other);
        return (((((((((((((this.arrDate == rhs.arrDate)||((this.arrDate!= null)&&this.arrDate.equals(rhs.arrDate)))&&((this.routeIdx == rhs.routeIdx)||((this.routeIdx!= null)&&this.routeIdx.equals(rhs.routeIdx))))&&((this.depTime == rhs.depTime)||((this.depTime!= null)&&this.depTime.equals(rhs.depTime))))&&((this.lon == rhs.lon)||((this.lon!= null)&&this.lon.equals(rhs.lon))))&&((this.depDate == rhs.depDate)||((this.depDate!= null)&&this.depDate.equals(rhs.depDate))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.depDir == rhs.depDir)||((this.depDir!= null)&&this.depDir.equals(rhs.depDir))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.extId == rhs.extId)||((this.extId!= null)&&this.extId.equals(rhs.extId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.arrTime == rhs.arrTime)||((this.arrTime!= null)&&this.arrTime.equals(rhs.arrTime))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))));
    }

}
