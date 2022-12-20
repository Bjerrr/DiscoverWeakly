
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
    "Trip",
    "ResultStatus",
    "TechnicalMessages",
    "serverVersion",
    "dialectVersion",
    "planRtTs",
    "requestId",
    "scrB",
    "scrF"
})
@Generated("jsonschema2pojo")
public class JsonTripRoot {

    @SerializedName("Trip")
    private List<Trip> trip = new ArrayList<Trip>();
    @SerializedName("ResultStatus")
    private ResultStatus resultStatus;
    @SerializedName("TechnicalMessages")
    private TechnicalMessages technicalMessages;
    @SerializedName("serverVersion")
    private String serverVersion;
    @SerializedName("dialectVersion")
    private String dialectVersion;
    @SerializedName("planRtTs")
    private String planRtTs;
    @SerializedName("requestId")
    private String requestId;
    @SerializedName("scrB")
    private String scrB;
    @SerializedName("scrF")
    private String scrF;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public JsonTripRoot() {
    }

    /**
     * 
     * @param resultStatus
     * @param dialectVersion
     * @param scrF
     * @param serverVersion
     * @param trip
     * @param planRtTs
     * @param scrB
     * @param requestId
     * @param technicalMessages
     */
    public JsonTripRoot(List<Trip> trip, ResultStatus resultStatus, TechnicalMessages technicalMessages, String serverVersion, String dialectVersion, String planRtTs, String requestId, String scrB, String scrF) {
        super();
        this.trip = trip;
        this.resultStatus = resultStatus;
        this.technicalMessages = technicalMessages;
        this.serverVersion = serverVersion;
        this.dialectVersion = dialectVersion;
        this.planRtTs = planRtTs;
        this.requestId = requestId;
        this.scrB = scrB;
        this.scrF = scrF;
    }

    @SerializedName("Trip")
    public List<Trip> getTrip() {
        return trip;
    }

    @SerializedName("Trip")
    public void setTrip(List<Trip> trip) {
        this.trip = trip;
    }

    public JsonTripRoot withTrip(List<Trip> trip) {
        this.trip = trip;
        return this;
    }

    @SerializedName("ResultStatus")
    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    @SerializedName("ResultStatus")
    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    public JsonTripRoot withResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    @SerializedName("TechnicalMessages")
    public TechnicalMessages getTechnicalMessages() {
        return technicalMessages;
    }

    @SerializedName("TechnicalMessages")
    public void setTechnicalMessages(TechnicalMessages technicalMessages) {
        this.technicalMessages = technicalMessages;
    }

    public JsonTripRoot withTechnicalMessages(TechnicalMessages technicalMessages) {
        this.technicalMessages = technicalMessages;
        return this;
    }

    @SerializedName("serverVersion")
    public String getServerVersion() {
        return serverVersion;
    }

    @SerializedName("serverVersion")
    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public JsonTripRoot withServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    @SerializedName("dialectVersion")
    public String getDialectVersion() {
        return dialectVersion;
    }

    @SerializedName("dialectVersion")
    public void setDialectVersion(String dialectVersion) {
        this.dialectVersion = dialectVersion;
    }

    public JsonTripRoot withDialectVersion(String dialectVersion) {
        this.dialectVersion = dialectVersion;
        return this;
    }

    @SerializedName("planRtTs")
    public String getPlanRtTs() {
        return planRtTs;
    }

    @SerializedName("planRtTs")
    public void setPlanRtTs(String planRtTs) {
        this.planRtTs = planRtTs;
    }

    public JsonTripRoot withPlanRtTs(String planRtTs) {
        this.planRtTs = planRtTs;
        return this;
    }

    @SerializedName("requestId")
    public String getRequestId() {
        return requestId;
    }

    @SerializedName("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public JsonTripRoot withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @SerializedName("scrB")
    public String getScrB() {
        return scrB;
    }

    @SerializedName("scrB")
    public void setScrB(String scrB) {
        this.scrB = scrB;
    }

    public JsonTripRoot withScrB(String scrB) {
        this.scrB = scrB;
        return this;
    }

    @SerializedName("scrF")
    public String getScrF() {
        return scrF;
    }

    @SerializedName("scrF")
    public void setScrF(String scrF) {
        this.scrF = scrF;
    }

    public JsonTripRoot withScrF(String scrF) {
        this.scrF = scrF;
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

    public JsonTripRoot withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JsonTripRoot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trip");
        sb.append('=');
        sb.append(((this.trip == null)?"<null>":this.trip));
        sb.append(',');
        sb.append("resultStatus");
        sb.append('=');
        sb.append(((this.resultStatus == null)?"<null>":this.resultStatus));
        sb.append(',');
        sb.append("technicalMessages");
        sb.append('=');
        sb.append(((this.technicalMessages == null)?"<null>":this.technicalMessages));
        sb.append(',');
        sb.append("serverVersion");
        sb.append('=');
        sb.append(((this.serverVersion == null)?"<null>":this.serverVersion));
        sb.append(',');
        sb.append("dialectVersion");
        sb.append('=');
        sb.append(((this.dialectVersion == null)?"<null>":this.dialectVersion));
        sb.append(',');
        sb.append("planRtTs");
        sb.append('=');
        sb.append(((this.planRtTs == null)?"<null>":this.planRtTs));
        sb.append(',');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
        sb.append(',');
        sb.append("scrB");
        sb.append('=');
        sb.append(((this.scrB == null)?"<null>":this.scrB));
        sb.append(',');
        sb.append("scrF");
        sb.append('=');
        sb.append(((this.scrF == null)?"<null>":this.scrF));
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
        result = ((result* 31)+((this.resultStatus == null)? 0 :this.resultStatus.hashCode()));
        result = ((result* 31)+((this.dialectVersion == null)? 0 :this.dialectVersion.hashCode()));
        result = ((result* 31)+((this.scrF == null)? 0 :this.scrF.hashCode()));
        result = ((result* 31)+((this.serverVersion == null)? 0 :this.serverVersion.hashCode()));
        result = ((result* 31)+((this.trip == null)? 0 :this.trip.hashCode()));
        result = ((result* 31)+((this.planRtTs == null)? 0 :this.planRtTs.hashCode()));
        result = ((result* 31)+((this.scrB == null)? 0 :this.scrB.hashCode()));
        result = ((result* 31)+((this.requestId == null)? 0 :this.requestId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.technicalMessages == null)? 0 :this.technicalMessages.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JsonTripRoot) == false) {
            return false;
        }
        JsonTripRoot rhs = ((JsonTripRoot) other);
        return (((((((((((this.resultStatus == rhs.resultStatus)||((this.resultStatus!= null)&&this.resultStatus.equals(rhs.resultStatus)))&&((this.dialectVersion == rhs.dialectVersion)||((this.dialectVersion!= null)&&this.dialectVersion.equals(rhs.dialectVersion))))&&((this.scrF == rhs.scrF)||((this.scrF!= null)&&this.scrF.equals(rhs.scrF))))&&((this.serverVersion == rhs.serverVersion)||((this.serverVersion!= null)&&this.serverVersion.equals(rhs.serverVersion))))&&((this.trip == rhs.trip)||((this.trip!= null)&&this.trip.equals(rhs.trip))))&&((this.planRtTs == rhs.planRtTs)||((this.planRtTs!= null)&&this.planRtTs.equals(rhs.planRtTs))))&&((this.scrB == rhs.scrB)||((this.scrB!= null)&&this.scrB.equals(rhs.scrB))))&&((this.requestId == rhs.requestId)||((this.requestId!= null)&&this.requestId.equals(rhs.requestId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.technicalMessages == rhs.technicalMessages)||((this.technicalMessages!= null)&&this.technicalMessages.equals(rhs.technicalMessages))));
    }

}
