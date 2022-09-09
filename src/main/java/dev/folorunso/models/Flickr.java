package dev.folorunso.models;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "small",
        "original"
})
@Generated("jsonschema2pojo")
public class Flickr {

    @JsonProperty("small")
    public List<Object> small = null;
    @JsonProperty("original")
    public List<Object> original = null;

}