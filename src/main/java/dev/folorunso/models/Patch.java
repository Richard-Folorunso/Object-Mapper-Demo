package dev.folorunso.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "small",
        "large"
})
@Generated("jsonschema2pojo")
public class Patch {

    @JsonProperty("small")
    public String small;
    @JsonProperty("large")
    public String large;

}