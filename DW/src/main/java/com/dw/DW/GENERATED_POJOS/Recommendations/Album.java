
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
    "album_type",
    "artists",
    "external_urls",
    "href",
    "id",
    "images",
    "name",
    "release_date",
    "release_date_precision",
    "total_tracks",
    "type",
    "uri"
})
@Generated("jsonschema2pojo")
public class Album {

    @SerializedName("album_type")
    private String albumType;
    @SerializedName("artists")
    private List<Artist> artists = new ArrayList<Artist>();
    @SerializedName("external_urls")
    private ExternalUrls__1 externalUrls;
    @SerializedName("href")
    private String href;
    @SerializedName("id")
    private String id;
    @SerializedName("images")
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("name")
    private String name;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("release_date_precision")
    private String releaseDatePrecision;
    @SerializedName("total_tracks")
    private Integer totalTracks;
    @SerializedName("type")
    private String type;
    @SerializedName("uri")
    private String uri;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Album() {
    }

    /**
     * 
     * @param images
     * @param artists
     * @param releaseDate
     * @param totalTracks
     * @param albumType
     * @param name
     * @param releaseDatePrecision
     * @param externalUrls
     * @param href
     * @param id
     * @param type
     * @param uri
     */
    public Album(String albumType, List<Artist> artists, ExternalUrls__1 externalUrls, String href, String id, List<Image> images, String name, String releaseDate, String releaseDatePrecision, Integer totalTracks, String type, String uri) {
        super();
        this.albumType = albumType;
        this.artists = artists;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.releaseDate = releaseDate;
        this.releaseDatePrecision = releaseDatePrecision;
        this.totalTracks = totalTracks;
        this.type = type;
        this.uri = uri;
    }

    @SerializedName("album_type")
    public String getAlbumType() {
        return albumType;
    }

    @SerializedName("album_type")
    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    public Album withAlbumType(String albumType) {
        this.albumType = albumType;
        return this;
    }

    @SerializedName("artists")
    public List<Artist> getArtists() {
        return artists;
    }

    @SerializedName("artists")
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Album withArtists(List<Artist> artists) {
        this.artists = artists;
        return this;
    }

    @SerializedName("external_urls")
    public ExternalUrls__1 getExternalUrls() {
        return externalUrls;
    }

    @SerializedName("external_urls")
    public void setExternalUrls(ExternalUrls__1 externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Album withExternalUrls(ExternalUrls__1 externalUrls) {
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

    public Album withHref(String href) {
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

    public Album withId(String id) {
        this.id = id;
        return this;
    }

    @SerializedName("images")
    public List<Image> getImages() {
        return images;
    }

    @SerializedName("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Album withImages(List<Image> images) {
        this.images = images;
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

    public Album withName(String name) {
        this.name = name;
        return this;
    }

    @SerializedName("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @SerializedName("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Album withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @SerializedName("release_date_precision")
    public String getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    @SerializedName("release_date_precision")
    public void setReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
    }

    public Album withReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
        return this;
    }

    @SerializedName("total_tracks")
    public Integer getTotalTracks() {
        return totalTracks;
    }

    @SerializedName("total_tracks")
    public void setTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
    }

    public Album withTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
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

    public Album withType(String type) {
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

    public Album withUri(String uri) {
        this.uri = uri;
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

    public Album withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Album.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("albumType");
        sb.append('=');
        sb.append(((this.albumType == null)?"<null>":this.albumType));
        sb.append(',');
        sb.append("artists");
        sb.append('=');
        sb.append(((this.artists == null)?"<null>":this.artists));
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
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("releaseDatePrecision");
        sb.append('=');
        sb.append(((this.releaseDatePrecision == null)?"<null>":this.releaseDatePrecision));
        sb.append(',');
        sb.append("totalTracks");
        sb.append('=');
        sb.append(((this.totalTracks == null)?"<null>":this.totalTracks));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
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
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.externalUrls == null)? 0 :this.externalUrls.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.uri == null)? 0 :this.uri.hashCode()));
        result = ((result* 31)+((this.artists == null)? 0 :this.artists.hashCode()));
        result = ((result* 31)+((this.totalTracks == null)? 0 :this.totalTracks.hashCode()));
        result = ((result* 31)+((this.albumType == null)? 0 :this.albumType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.releaseDatePrecision == null)? 0 :this.releaseDatePrecision.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Album) == false) {
            return false;
        }
        Album rhs = ((Album) other);
        return ((((((((((((((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images)))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.externalUrls == rhs.externalUrls)||((this.externalUrls!= null)&&this.externalUrls.equals(rhs.externalUrls))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.uri == rhs.uri)||((this.uri!= null)&&this.uri.equals(rhs.uri))))&&((this.artists == rhs.artists)||((this.artists!= null)&&this.artists.equals(rhs.artists))))&&((this.totalTracks == rhs.totalTracks)||((this.totalTracks!= null)&&this.totalTracks.equals(rhs.totalTracks))))&&((this.albumType == rhs.albumType)||((this.albumType!= null)&&this.albumType.equals(rhs.albumType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.releaseDatePrecision == rhs.releaseDatePrecision)||((this.releaseDatePrecision!= null)&&this.releaseDatePrecision.equals(rhs.releaseDatePrecision))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
