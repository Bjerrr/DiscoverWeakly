
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
    "Origin",
    "Destination",
    "ServiceDays",
    "LegList",
    "calculation",
    "TripStatus",
    "idx",
    "tripId",
    "ctxRecon",
    "duration",
    "rtDuration",
    "checksum"
})
@Generated("jsonschema2pojo")
public class Trip {

    @SerializedName("Origin")
    private Origin origin;
    @SerializedName("Destination")
    private Destination destination;
    @SerializedName("ServiceDays")
    private List<ServiceDay> serviceDays = new ArrayList<ServiceDay>();
    @SerializedName("LegList")
    private LegList legList;
    @SerializedName("calculation")
    private String calculation;
    @SerializedName("TripStatus")
    private TripStatus tripStatus;
    @SerializedName("idx")
    private Integer idx;
    @SerializedName("tripId")
    private String tripId;
    @SerializedName("ctxRecon")
    private String ctxRecon;
    @SerializedName("duration")
    private String duration;
    @SerializedName("rtDuration")
    private String rtDuration;
    @SerializedName("checksum")
    private String checksum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Trip() {
    }

    /**
     * 
     * @param calculation
     * @param duration
     * @param rtDuration
     * @param legList
     * @param origin
     * @param ctxRecon
     * @param destination
     * @param checksum
     * @param tripId
     * @param serviceDays
     * @param idx
     * @param tripStatus
     */
    public Trip(Origin origin, Destination destination, List<ServiceDay> serviceDays, LegList legList, String calculation, TripStatus tripStatus, Integer idx, String tripId, String ctxRecon, String duration, String rtDuration, String checksum) {
        super();
        this.origin = origin;
        this.destination = destination;
        this.serviceDays = serviceDays;
        this.legList = legList;
        this.calculation = calculation;
        this.tripStatus = tripStatus;
        this.idx = idx;
        this.tripId = tripId;
        this.ctxRecon = ctxRecon;
        this.duration = duration;
        this.rtDuration = rtDuration;
        this.checksum = checksum;
    }

    @SerializedName("Origin")
    public Origin getOrigin() {
        return origin;
    }

    @SerializedName("Origin")
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Trip withOrigin(Origin origin) {
        this.origin = origin;
        return this;
    }

    @SerializedName("Destination")
    public Destination getDestination() {
        return destination;
    }

    @SerializedName("Destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Trip withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    @SerializedName("ServiceDays")
    public List<ServiceDay> getServiceDays() {
        return serviceDays;
    }

    @SerializedName("ServiceDays")
    public void setServiceDays(List<ServiceDay> serviceDays) {
        this.serviceDays = serviceDays;
    }

    public Trip withServiceDays(List<ServiceDay> serviceDays) {
        this.serviceDays = serviceDays;
        return this;
    }

    @SerializedName("LegList")
    public LegList getLegList() {
        return legList;
    }

    @SerializedName("LegList")
    public void setLegList(LegList legList) {
        this.legList = legList;
    }

    public Trip withLegList(LegList legList) {
        this.legList = legList;
        return this;
    }

    @SerializedName("calculation")
    public String getCalculation() {
        return calculation;
    }

    @SerializedName("calculation")
    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public Trip withCalculation(String calculation) {
        this.calculation = calculation;
        return this;
    }

    @SerializedName("TripStatus")
    public TripStatus getTripStatus() {
        return tripStatus;
    }

    @SerializedName("TripStatus")
    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Trip withTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
        return this;
    }

    @SerializedName("idx")
    public Integer getIdx() {
        return idx;
    }

    @SerializedName("idx")
    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Trip withIdx(Integer idx) {
        this.idx = idx;
        return this;
    }

    @SerializedName("tripId")
    public String getTripId() {
        return tripId;
    }

    @SerializedName("tripId")
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public Trip withTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }

    @SerializedName("ctxRecon")
    public String getCtxRecon() {
        return ctxRecon;
    }

    @SerializedName("ctxRecon")
    public void setCtxRecon(String ctxRecon) {
        this.ctxRecon = ctxRecon;
    }

    public Trip withCtxRecon(String ctxRecon) {
        this.ctxRecon = ctxRecon;
        return this;
    }

    @SerializedName("duration")
    public String getDuration() {
        return duration;
    }

    @SerializedName("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Trip withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    @SerializedName("rtDuration")
    public String getRtDuration() {
        return rtDuration;
    }

    @SerializedName("rtDuration")
    public void setRtDuration(String rtDuration) {
        this.rtDuration = rtDuration;
    }

    public Trip withRtDuration(String rtDuration) {
        this.rtDuration = rtDuration;
        return this;
    }

    @SerializedName("checksum")
    public String getChecksum() {
        return checksum;
    }

    @SerializedName("checksum")
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Trip withChecksum(String checksum) {
        this.checksum = checksum;
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

    public Trip withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Trip.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("serviceDays");
        sb.append('=');
        sb.append(((this.serviceDays == null)?"<null>":this.serviceDays));
        sb.append(',');
        sb.append("legList");
        sb.append('=');
        sb.append(((this.legList == null)?"<null>":this.legList));
        sb.append(',');
        sb.append("calculation");
        sb.append('=');
        sb.append(((this.calculation == null)?"<null>":this.calculation));
        sb.append(',');
        sb.append("tripStatus");
        sb.append('=');
        sb.append(((this.tripStatus == null)?"<null>":this.tripStatus));
        sb.append(',');
        sb.append("idx");
        sb.append('=');
        sb.append(((this.idx == null)?"<null>":this.idx));
        sb.append(',');
        sb.append("tripId");
        sb.append('=');
        sb.append(((this.tripId == null)?"<null>":this.tripId));
        sb.append(',');
        sb.append("ctxRecon");
        sb.append('=');
        sb.append(((this.ctxRecon == null)?"<null>":this.ctxRecon));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("rtDuration");
        sb.append('=');
        sb.append(((this.rtDuration == null)?"<null>":this.rtDuration));
        sb.append(',');
        sb.append("checksum");
        sb.append('=');
        sb.append(((this.checksum == null)?"<null>":this.checksum));
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
        result = ((result* 31)+((this.calculation == null)? 0 :this.calculation.hashCode()));
        result = ((result* 31)+((this.rtDuration == null)? 0 :this.rtDuration.hashCode()));
        result = ((result* 31)+((this.legList == null)? 0 :this.legList.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.tripId == null)? 0 :this.tripId.hashCode()));
        result = ((result* 31)+((this.serviceDays == null)? 0 :this.serviceDays.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.ctxRecon == null)? 0 :this.ctxRecon.hashCode()));
        result = ((result* 31)+((this.checksum == null)? 0 :this.checksum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.idx == null)? 0 :this.idx.hashCode()));
        result = ((result* 31)+((this.tripStatus == null)? 0 :this.tripStatus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trip) == false) {
            return false;
        }
        Trip rhs = ((Trip) other);
        return ((((((((((((((this.calculation == rhs.calculation)||((this.calculation!= null)&&this.calculation.equals(rhs.calculation)))&&((this.rtDuration == rhs.rtDuration)||((this.rtDuration!= null)&&this.rtDuration.equals(rhs.rtDuration))))&&((this.legList == rhs.legList)||((this.legList!= null)&&this.legList.equals(rhs.legList))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.tripId == rhs.tripId)||((this.tripId!= null)&&this.tripId.equals(rhs.tripId))))&&((this.serviceDays == rhs.serviceDays)||((this.serviceDays!= null)&&this.serviceDays.equals(rhs.serviceDays))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.ctxRecon == rhs.ctxRecon)||((this.ctxRecon!= null)&&this.ctxRecon.equals(rhs.ctxRecon))))&&((this.checksum == rhs.checksum)||((this.checksum!= null)&&this.checksum.equals(rhs.checksum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idx == rhs.idx)||((this.idx!= null)&&this.idx.equals(rhs.idx))))&&((this.tripStatus == rhs.tripStatus)||((this.tripStatus!= null)&&this.tripStatus.equals(rhs.tripStatus))));
    }

}
