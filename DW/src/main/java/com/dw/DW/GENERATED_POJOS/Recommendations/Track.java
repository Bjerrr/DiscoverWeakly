
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
    "album",
    "artists",
    "disc_number",
    "duration_ms",
    "explicit",
    "external_ids",
    "external_urls",
    "href",
    "id",
    "is_local",
    "is_playable",
    "name",
    "popularity",
    "preview_url",
    "track_number",
    "type",
    "uri",
    "linked_from"
})
@Generated("jsonschema2pojo")
public class Track {

    @SerializedName("album")
    private Album album;
    @SerializedName("artists")
    private List<Artist__1> artists = new ArrayList<Artist__1>();
    @SerializedName("disc_number")
    private Integer discNumber;
    @SerializedName("duration_ms")
    private Integer durationMs;
    @SerializedName("explicit")
    private Boolean explicit;
    @SerializedName("external_ids")
    private ExternalIds externalIds;
    @SerializedName("external_urls")
    private ExternalUrls__3 externalUrls;
    @SerializedName("href")
    private String href;
    @SerializedName("id")
    private String id;
    @SerializedName("is_local")
    private Boolean isLocal;
    @SerializedName("is_playable")
    private Boolean isPlayable;
    @SerializedName("name")
    private String name;
    @SerializedName("popularity")
    private Integer popularity;
    @SerializedName("preview_url")
    private String previewUrl;
    @SerializedName("track_number")
    private Integer trackNumber;
    @SerializedName("type")
    private String type;
    @SerializedName("uri")
    private String uri;
    @SerializedName("linked_from")
    private LinkedFrom linkedFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Track() {
    }

    /**
     * 
     * @param isPlayable
     * @param previewUrl
     * @param trackNumber
     * @param album
     * @param linkedFrom
     * @param externalIds
     * @param externalUrls
     * @param type
     * @param uri
     * @param isLocal
     * @param explicit
     * @param discNumber
     * @param artists
     * @param popularity
     * @param name
     * @param href
     * @param id
     * @param durationMs
     */
    public Track(Album album, List<Artist__1> artists, Integer discNumber, Integer durationMs, Boolean explicit, ExternalIds externalIds, ExternalUrls__3 externalUrls, String href, String id, Boolean isLocal, Boolean isPlayable, String name, Integer popularity, String previewUrl, Integer trackNumber, String type, String uri, LinkedFrom linkedFrom) {
        super();
        this.album = album;
        this.artists = artists;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalIds = externalIds;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.isLocal = isLocal;
        this.isPlayable = isPlayable;
        this.name = name;
        this.popularity = popularity;
        this.previewUrl = previewUrl;
        this.trackNumber = trackNumber;
        this.type = type;
        this.uri = uri;
        this.linkedFrom = linkedFrom;
    }

    @SerializedName("album")
    public Album getAlbum() {
        return album;
    }

    @SerializedName("album")
    public void setAlbum(Album album) {
        this.album = album;
    }

    public Track withAlbum(Album album) {
        this.album = album;
        return this;
    }

    @SerializedName("artists")
    public List<Artist__1> getArtists() {
        return artists;
    }

    @SerializedName("artists")
    public void setArtists(List<Artist__1> artists) {
        this.artists = artists;
    }

    public Track withArtists(List<Artist__1> artists) {
        this.artists = artists;
        return this;
    }

    @SerializedName("disc_number")
    public Integer getDiscNumber() {
        return discNumber;
    }

    @SerializedName("disc_number")
    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Track withDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
        return this;
    }

    @SerializedName("duration_ms")
    public Integer getDurationMs() {
        return durationMs;
    }

    @SerializedName("duration_ms")
    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    public Track withDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @SerializedName("explicit")
    public Boolean getExplicit() {
        return explicit;
    }

    @SerializedName("explicit")
    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public Track withExplicit(Boolean explicit) {
        this.explicit = explicit;
        return this;
    }

    @SerializedName("external_ids")
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    @SerializedName("external_ids")
    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    public Track withExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
        return this;
    }

    @SerializedName("external_urls")
    public ExternalUrls__3 getExternalUrls() {
        return externalUrls;
    }

    @SerializedName("external_urls")
    public void setExternalUrls(ExternalUrls__3 externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Track withExternalUrls(ExternalUrls__3 externalUrls) {
        this.externalUrls = externalUrls;
        return this;
    }

    @SerializedName("href")
    public String getHref() {
        return href;
    }

    @SerializedName("href")
    public void setHref(String href) {
        this.href = href;
    }

    public Track withHref(String href) {
        this.href = href;
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

    public Track withId(String id) {
        this.id = id;
        return this;
    }

    @SerializedName("is_local")
    public Boolean getIsLocal() {
        return isLocal;
    }

    @SerializedName("is_local")
    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Track withIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
        return this;
    }

    @SerializedName("is_playable")
    public Boolean getIsPlayable() {
        return isPlayable;
    }

    @SerializedName("is_playable")
    public void setIsPlayable(Boolean isPlayable) {
        this.isPlayable = isPlayable;
    }

    public Track withIsPlayable(Boolean isPlayable) {
        this.isPlayable = isPlayable;
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

    public Track withName(String name) {
        this.name = name;
        return this;
    }

    @SerializedName("popularity")
    public Integer getPopularity() {
        return popularity;
    }

    @SerializedName("popularity")
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Track withPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }

    @SerializedName("preview_url")
    public String getPreviewUrl() {
        return previewUrl;
    }

    @SerializedName("preview_url")
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Track withPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    @SerializedName("track_number")
    public Integer getTrackNumber() {
        return trackNumber;
    }

    @SerializedName("track_number")
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Track withTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
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

    public Track withType(String type) {
        this.type = type;
        return this;
    }

    @SerializedName("uri")
    public String getUri() {
        return uri;
    }

    @SerializedName("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public Track withUri(String uri) {
        this.uri = uri;
        return this;
    }

    @SerializedName("linked_from")
    public LinkedFrom getLinkedFrom() {
        return linkedFrom;
    }

    @SerializedName("linked_from")
    public void setLinkedFrom(LinkedFrom linkedFrom) {
        this.linkedFrom = linkedFrom;
    }

    public Track withLinkedFrom(LinkedFrom linkedFrom) {
        this.linkedFrom = linkedFrom;
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

    public Track withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Track.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("album");
        sb.append('=');
        sb.append(((this.album == null)?"<null>":this.album));
        sb.append(',');
        sb.append("artists");
        sb.append('=');
        sb.append(((this.artists == null)?"<null>":this.artists));
        sb.append(',');
        sb.append("discNumber");
        sb.append('=');
        sb.append(((this.discNumber == null)?"<null>":this.discNumber));
        sb.append(',');
        sb.append("durationMs");
        sb.append('=');
        sb.append(((this.durationMs == null)?"<null>":this.durationMs));
        sb.append(',');
        sb.append("explicit");
        sb.append('=');
        sb.append(((this.explicit == null)?"<null>":this.explicit));
        sb.append(',');
        sb.append("externalIds");
        sb.append('=');
        sb.append(((this.externalIds == null)?"<null>":this.externalIds));
        sb.append(',');
        sb.append("externalUrls");
        sb.append('=');
        sb.append(((this.externalUrls == null)?"<null>":this.externalUrls));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isLocal");
        sb.append('=');
        sb.append(((this.isLocal == null)?"<null>":this.isLocal));
        sb.append(',');
        sb.append("isPlayable");
        sb.append('=');
        sb.append(((this.isPlayable == null)?"<null>":this.isPlayable));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("popularity");
        sb.append('=');
        sb.append(((this.popularity == null)?"<null>":this.popularity));
        sb.append(',');
        sb.append("previewUrl");
        sb.append('=');
        sb.append(((this.previewUrl == null)?"<null>":this.previewUrl));
        sb.append(',');
        sb.append("trackNumber");
        sb.append('=');
        sb.append(((this.trackNumber == null)?"<null>":this.trackNumber));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
        sb.append(',');
        sb.append("linkedFrom");
        sb.append('=');
        sb.append(((this.linkedFrom == null)?"<null>":this.linkedFrom));
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
        result = ((result* 31)+((this.isPlayable == null)? 0 :this.isPlayable.hashCode()));
        result = ((result* 31)+((this.previewUrl == null)? 0 :this.previewUrl.hashCode()));
        result = ((result* 31)+((this.trackNumber == null)? 0 :this.trackNumber.hashCode()));
        result = ((result* 31)+((this.album == null)? 0 :this.album.hashCode()));
        result = ((result* 31)+((this.linkedFrom == null)? 0 :this.linkedFrom.hashCode()));
        result = ((result* 31)+((this.externalIds == null)? 0 :this.externalIds.hashCode()));
        result = ((result* 31)+((this.externalUrls == null)? 0 :this.externalUrls.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.uri == null)? 0 :this.uri.hashCode()));
        result = ((result* 31)+((this.isLocal == null)? 0 :this.isLocal.hashCode()));
        result = ((result* 31)+((this.explicit == null)? 0 :this.explicit.hashCode()));
        result = ((result* 31)+((this.discNumber == null)? 0 :this.discNumber.hashCode()));
        result = ((result* 31)+((this.artists == null)? 0 :this.artists.hashCode()));
        result = ((result* 31)+((this.popularity == null)? 0 :this.popularity.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.durationMs == null)? 0 :this.durationMs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Track) == false) {
            return false;
        }
        Track rhs = ((Track) other);
        return ((((((((((((((((((((this.isPlayable == rhs.isPlayable)||((this.isPlayable!= null)&&this.isPlayable.equals(rhs.isPlayable)))&&((this.previewUrl == rhs.previewUrl)||((this.previewUrl!= null)&&this.previewUrl.equals(rhs.previewUrl))))&&((this.trackNumber == rhs.trackNumber)||((this.trackNumber!= null)&&this.trackNumber.equals(rhs.trackNumber))))&&((this.album == rhs.album)||((this.album!= null)&&this.album.equals(rhs.album))))&&((this.linkedFrom == rhs.linkedFrom)||((this.linkedFrom!= null)&&this.linkedFrom.equals(rhs.linkedFrom))))&&((this.externalIds == rhs.externalIds)||((this.externalIds!= null)&&this.externalIds.equals(rhs.externalIds))))&&((this.externalUrls == rhs.externalUrls)||((this.externalUrls!= null)&&this.externalUrls.equals(rhs.externalUrls))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.uri == rhs.uri)||((this.uri!= null)&&this.uri.equals(rhs.uri))))&&((this.isLocal == rhs.isLocal)||((this.isLocal!= null)&&this.isLocal.equals(rhs.isLocal))))&&((this.explicit == rhs.explicit)||((this.explicit!= null)&&this.explicit.equals(rhs.explicit))))&&((this.discNumber == rhs.discNumber)||((this.discNumber!= null)&&this.discNumber.equals(rhs.discNumber))))&&((this.artists == rhs.artists)||((this.artists!= null)&&this.artists.equals(rhs.artists))))&&((this.popularity == rhs.popularity)||((this.popularity!= null)&&this.popularity.equals(rhs.popularity))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.durationMs == rhs.durationMs)||((this.durationMs!= null)&&this.durationMs.equals(rhs.durationMs))));
    }

}
