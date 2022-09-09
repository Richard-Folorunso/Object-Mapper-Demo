package dev.folorunso.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "patch",
        "reddit",
        "flickr",
        "presskit",
        "webcast",
        "youtube_id",
        "article",
        "wikipedia"
})
@Generated("jsonschema2pojo")
public class Links {

    @JsonProperty("patch")
    public Patch patch;
    @JsonProperty("reddit")
    public Reddit reddit;
    @JsonProperty("flickr")
    public Flickr flickr;
    @JsonProperty("presskit")
    public Object presskit;
    @JsonProperty("webcast")
    public String webcast;
    @JsonProperty("youtube_id")
    public String youtubeId;
    @JsonProperty("article")
    public Object article;
    @JsonProperty("wikipedia")
    public Object wikipedia;

}