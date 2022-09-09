package dev.folorunso.models;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "reused",
        "recovery_attempt",
        "recovered",
        "ships"
})
@Generated("jsonschema2pojo")
public class Fairings {

    @JsonProperty("reused")
    public Object reused;
    @JsonProperty("recovery_attempt")
    public Object recoveryAttempt;
    @JsonProperty("recovered")
    public Object recovered;
    @JsonProperty("ships")
    public List<Object> ships = null;

}