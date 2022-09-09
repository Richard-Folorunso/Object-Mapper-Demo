package dev.folorunso.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "core",
        "flight",
        "gridfins",
        "legs",
        "reused",
        "landing_attempt",
        "landing_success",
        "landing_type",
        "landpad"
})
@Generated("jsonschema2pojo")
public class Core {

    @JsonProperty("core")
    public String core;
    @JsonProperty("flight")
    public int flight;
    @JsonProperty("gridfins")
    public boolean gridfins;
    @JsonProperty("legs")
    public boolean legs;
    @JsonProperty("reused")
    public boolean reused;
    @JsonProperty("landing_attempt")
    public boolean landingAttempt;
    @JsonProperty("landing_success")
    public boolean landingSuccess;
    @JsonProperty("landing_type")
    public String landingType;
    @JsonProperty("landpad")
    public String landpad;

}