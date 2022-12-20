
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
    "Notes",
    "JourneyDetailRef",
    "JourneyStatus",
    "Product",
    "Stops",
    "JourneyDetail",
    "idx",
    "name",
    "number",
    "category",
    "type",
    "reachable",
    "direction",
    "directionFlag",
    "duration"
})
@Generated("jsonschema2pojo")
public class Leg {

    @SerializedName("Origin")
    private Origin__1 origin;
    @SerializedName("Destination")
    private Destination__1 destination;
    @SerializedName("Notes")
    private Notes notes;
    @SerializedName("JourneyDetailRef")
    private JourneyDetailRef journeyDetailRef;
    @SerializedName("JourneyStatus")
    private String journeyStatus;
    @SerializedName("Product")
    private List<Product> product = new ArrayList<Product>();
    @SerializedName("Stops")
    private Stops stops;
    @SerializedName("JourneyDetail")
    private JourneyDetail journeyDetail;
    @SerializedName("idx")
    private Integer idx;
    @SerializedName("name")
    private String name;
    @SerializedName("number")
    private String number;
    @SerializedName("category")
    private String category;
    @SerializedName("type")
    private String type;
    @SerializedName("reachable")
    private Boolean reachable;
    @SerializedName("direction")
    private String direction;
    @SerializedName("directionFlag")
    private String directionFlag;
    @SerializedName("duration")
    private String duration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Leg() {
    }

    /**
     * 
     * @param product
     * @param notes
     * @param origin
     * @param destination
     * @param directionFlag
     * @param type
     * @param reachable
     * @param duration
     * @param journeyDetail
     * @param number
     * @param journeyStatus
     * @param name
     * @param stops
     * @param idx
     * @param category
     * @param journeyDetailRef
     * @param direction
     */
    public Leg(Origin__1 origin, Destination__1 destination, Notes notes, JourneyDetailRef journeyDetailRef, String journeyStatus, List<Product> product, Stops stops, JourneyDetail journeyDetail, Integer idx, String name, String number, String category, String type, Boolean reachable, String direction, String directionFlag, String duration) {
        super();
        this.origin = origin;
        this.destination = destination;
        this.notes = notes;
        this.journeyDetailRef = journeyDetailRef;
        this.journeyStatus = journeyStatus;
        this.product = product;
        this.stops = stops;
        this.journeyDetail = journeyDetail;
        this.idx = idx;
        this.name = name;
        this.number = number;
        this.category = category;
        this.type = type;
        this.reachable = reachable;
        this.direction = direction;
        this.directionFlag = directionFlag;
        this.duration = duration;
    }

    @SerializedName("Origin")
    public Origin__1 getOrigin() {
        return origin;
    }

    @SerializedName("Origin")
    public void setOrigin(Origin__1 origin) {
        this.origin = origin;
    }

    public Leg withOrigin(Origin__1 origin) {
        this.origin = origin;
        return this;
    }

    @SerializedName("Destination")
    public Destination__1 getDestination() {
        return destination;
    }

    @SerializedName("Destination")
    public void setDestination(Destination__1 destination) {
        this.destination = destination;
    }

    public Leg withDestination(Destination__1 destination) {
        this.destination = destination;
        return this;
    }

    @SerializedName("Notes")
    public Notes getNotes() {
        return notes;
    }

    @SerializedName("Notes")
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Leg withNotes(Notes notes) {
        this.notes = notes;
        return this;
    }

    @SerializedName("JourneyDetailRef")
    public JourneyDetailRef getJourneyDetailRef() {
        return journeyDetailRef;
    }

    @SerializedName("JourneyDetailRef")
    public void setJourneyDetailRef(JourneyDetailRef journeyDetailRef) {
        this.journeyDetailRef = journeyDetailRef;
    }

    public Leg withJourneyDetailRef(JourneyDetailRef journeyDetailRef) {
        this.journeyDetailRef = journeyDetailRef;
        return this;
    }

    @SerializedName("JourneyStatus")
    public String getJourneyStatus() {
        return journeyStatus;
    }

    @SerializedName("JourneyStatus")
    public void setJourneyStatus(String journeyStatus) {
        this.journeyStatus = journeyStatus;
    }

    public Leg withJourneyStatus(String journeyStatus) {
        this.journeyStatus = journeyStatus;
        return this;
    }

    @SerializedName("Product")
    public List<Product> getProduct() {
        return product;
    }

    @SerializedName("Product")
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Leg withProduct(List<Product> product) {
        this.product = product;
        return this;
    }

    @SerializedName("Stops")
    public Stops getStops() {
        return stops;
    }

    @SerializedName("Stops")
    public void setStops(Stops stops) {
        this.stops = stops;
    }

    public Leg withStops(Stops stops) {
        this.stops = stops;
        return this;
    }

    @SerializedName("JourneyDetail")
    public JourneyDetail getJourneyDetail() {
        return journeyDetail;
    }

    @SerializedName("JourneyDetail")
    public void setJourneyDetail(JourneyDetail journeyDetail) {
        this.journeyDetail = journeyDetail;
    }

    public Leg withJourneyDetail(JourneyDetail journeyDetail) {
        this.journeyDetail = journeyDetail;
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

    public Leg withIdx(Integer idx) {
        this.idx = idx;
        return this;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    public Leg withName(String name) {
        this.name = name;
        return this;
    }

    @SerializedName("number")
    public String getNumber() {
        return number;
    }

    @SerializedName("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Leg withNumber(String number) {
        this.number = number;
        return this;
    }

    @SerializedName("category")
    public String getCategory() {
        return category;
    }

    @SerializedName("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Leg withCategory(String category) {
        this.category = category;
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

    public Leg withType(String type) {
        this.type = type;
        return this;
    }

    @SerializedName("reachable")
    public Boolean getReachable() {
        return reachable;
    }

    @SerializedName("reachable")
    public void setReachable(Boolean reachable) {
        this.reachable = reachable;
    }

    public Leg withReachable(Boolean reachable) {
        this.reachable = reachable;
        return this;
    }

    @SerializedName("direction")
    public String getDirection() {
        return direction;
    }

    @SerializedName("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Leg withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    @SerializedName("directionFlag")
    public String getDirectionFlag() {
        return directionFlag;
    }

    @SerializedName("directionFlag")
    public void setDirectionFlag(String directionFlag) {
        this.directionFlag = directionFlag;
    }

    public Leg withDirectionFlag(String directionFlag) {
        this.directionFlag = directionFlag;
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

    public Leg withDuration(String duration) {
        this.duration = duration;
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

    public Leg withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Leg.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("journeyDetailRef");
        sb.append('=');
        sb.append(((this.journeyDetailRef == null)?"<null>":this.journeyDetailRef));
        sb.append(',');
        sb.append("journeyStatus");
        sb.append('=');
        sb.append(((this.journeyStatus == null)?"<null>":this.journeyStatus));
        sb.append(',');
        sb.append("product");
        sb.append('=');
        sb.append(((this.product == null)?"<null>":this.product));
        sb.append(',');
        sb.append("stops");
        sb.append('=');
        sb.append(((this.stops == null)?"<null>":this.stops));
        sb.append(',');
        sb.append("journeyDetail");
        sb.append('=');
        sb.append(((this.journeyDetail == null)?"<null>":this.journeyDetail));
        sb.append(',');
        sb.append("idx");
        sb.append('=');
        sb.append(((this.idx == null)?"<null>":this.idx));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("reachable");
        sb.append('=');
        sb.append(((this.reachable == null)?"<null>":this.reachable));
        sb.append(',');
        sb.append("direction");
        sb.append('=');
        sb.append(((this.direction == null)?"<null>":this.direction));
        sb.append(',');
        sb.append("directionFlag");
        sb.append('=');
        sb.append(((this.directionFlag == null)?"<null>":this.directionFlag));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
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
        result = ((result* 31)+((this.product == null)? 0 :this.product.hashCode()));
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.destination == null)? 0 :this.destination.hashCode()));
        result = ((result* 31)+((this.directionFlag == null)? 0 :this.directionFlag.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.reachable == null)? 0 :this.reachable.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.journeyDetail == null)? 0 :this.journeyDetail.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.journeyStatus == null)? 0 :this.journeyStatus.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.stops == null)? 0 :this.stops.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.idx == null)? 0 :this.idx.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.journeyDetailRef == null)? 0 :this.journeyDetailRef.hashCode()));
        result = ((result* 31)+((this.direction == null)? 0 :this.direction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Leg) == false) {
            return false;
        }
        Leg rhs = ((Leg) other);
        return (((((((((((((((((((this.product == rhs.product)||((this.product!= null)&&this.product.equals(rhs.product)))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.destination == rhs.destination)||((this.destination!= null)&&this.destination.equals(rhs.destination))))&&((this.directionFlag == rhs.directionFlag)||((this.directionFlag!= null)&&this.directionFlag.equals(rhs.directionFlag))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.reachable == rhs.reachable)||((this.reachable!= null)&&this.reachable.equals(rhs.reachable))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.journeyDetail == rhs.journeyDetail)||((this.journeyDetail!= null)&&this.journeyDetail.equals(rhs.journeyDetail))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.journeyStatus == rhs.journeyStatus)||((this.journeyStatus!= null)&&this.journeyStatus.equals(rhs.journeyStatus))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.stops == rhs.stops)||((this.stops!= null)&&this.stops.equals(rhs.stops))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idx == rhs.idx)||((this.idx!= null)&&this.idx.equals(rhs.idx))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.journeyDetailRef == rhs.journeyDetailRef)||((this.journeyDetailRef!= null)&&this.journeyDetailRef.equals(rhs.journeyDetailRef))))&&((this.direction == rhs.direction)||((this.direction!= null)&&this.direction.equals(rhs.direction))));
    }

}
