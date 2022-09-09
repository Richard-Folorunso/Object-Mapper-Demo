package dev.folorunso.models;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fairings",
        "links",
        "static_fire_date_utc",
        "static_fire_date_unix",
        "net",
        "window",
        "rocket",
        "success",
        "failures",
        "details",
        "crew",
        "ships",
        "capsules",
        "payloads",
        "launchpad",
        "flight_number",
        "name",
        "date_utc",
        "date_unix",
        "date_local",
        "date_precision",
        "upcoming",
        "cores",
        "auto_update",
        "tbd",
        "launch_library_id",
        "id"
})
@Generated("jsonschema2pojo")
public class Rocket {

    @JsonProperty("fairings")
    public Fairings fairings;
    @JsonProperty("links")
    public Links links;
    @JsonProperty("static_fire_date_utc")
    public Object staticFireDateUtc;
    @JsonProperty("static_fire_date_unix")
    public Object staticFireDateUnix;
    @JsonProperty("net")
    public boolean net;
    @JsonProperty("window")
    public Object window;
    @JsonProperty("rocket")
    public String rocket;
    @JsonProperty("success")
    public boolean success;
    @JsonProperty("failures")
    public List<Object> failures = null;
    @JsonProperty("details")
    public Object details;
    @JsonProperty("crew")
    public List<Object> crew = null;
    @JsonProperty("ships")
    public List<Object> ships = null;
    @JsonProperty("capsules")
    public List<Object> capsules = null;
    @JsonProperty("payloads")
    public List<String> payloads = null;
    @JsonProperty("launchpad")
    public String launchpad;
    @JsonProperty("flight_number")
    public int flightNumber;
    @JsonProperty("name")
    public String name;
    @JsonProperty("date_utc")
    public String dateUtc;
    @JsonProperty("date_unix")
    public int dateUnix;
    @JsonProperty("date_local")
    public String dateLocal;
    @JsonProperty("date_precision")
    public String datePrecision;
    @JsonProperty("upcoming")
    public boolean upcoming;
    @JsonProperty("cores")
    public List<Core> cores = null;
    @JsonProperty("auto_update")
    public boolean autoUpdate;
    @JsonProperty("tbd")
    public boolean tbd;
    @JsonProperty("launch_library_id")
    public Object launchLibraryId;
    @JsonProperty("id")
    public String id;

}