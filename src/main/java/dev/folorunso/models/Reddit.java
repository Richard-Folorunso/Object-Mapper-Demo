package dev.folorunso.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "campaign",
        "launch",
        "media",
        "recovery"
})
@Generated("jsonschema2pojo")
public class Reddit {

    @JsonProperty("campaign")
    public String campaign;
    @JsonProperty("launch")
    public Object launch;
    @JsonProperty("media")
    public Object media;
    @JsonProperty("recovery")
    public String recovery;

}