
package com.dw.DW.GENERATED_POJOS.Recommendations;

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
    "tracks",
    "seeds"
})
@Generated("jsonschema2pojo")
public class RecommendationsRoot {

    @SerializedName("tracks")
    private List<Track> tracks = new ArrayList<Track>();
    @SerializedName("seeds")
    private List<Seed> seeds = new ArrayList<Seed>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecommendationsRoot() {
    }

    /**
     * 
     * @param seeds
     * @param tracks
     */
    public RecommendationsRoot(List<Track> tracks, List<Seed> seeds) {
        super();
        this.tracks = tracks;
        this.seeds = seeds;
    }

    @SerializedName("tracks")
    public List<Track> getTracks() {
        return tracks;
    }

    @SerializedName("tracks")
    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public RecommendationsRoot withTracks(List<Track> tracks) {
        this.tracks = tracks;
        return this;
    }

    @SerializedName("seeds")
    public List<Seed> getSeeds() {
        return seeds;
    }

    @SerializedName("seeds")
    public void setSeeds(List<Seed> seeds) {
        this.seeds = seeds;
    }

    public RecommendationsRoot withSeeds(List<Seed> seeds) {
        this.seeds = seeds;
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

    public RecommendationsRoot withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecommendationsRoot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tracks");
        sb.append('=');
        sb.append(((this.tracks == null)?"<null>":this.tracks));
        sb.append(',');
        sb.append("seeds");
        sb.append('=');
        sb.append(((this.seeds == null)?"<null>":this.seeds));
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
        result = ((result* 31)+((this.tracks == null)? 0 :this.tracks.hashCode()));
        result = ((result* 31)+((this.seeds == null)? 0 :this.seeds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecommendationsRoot) == false) {
            return false;
        }
        RecommendationsRoot rhs = ((RecommendationsRoot) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.tracks == rhs.tracks)||((this.tracks!= null)&&this.tracks.equals(rhs.tracks))))&&((this.seeds == rhs.seeds)||((this.seeds!= null)&&this.seeds.equals(rhs.seeds))));
    }

}
