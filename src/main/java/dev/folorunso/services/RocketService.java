package dev.folorunso.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.folorunso.models.Rocket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;

@Service
public class RocketService {

    RestTemplate restTemplate = new RestTemplate();
    ObjectMapper mapper = new ObjectMapper();
    @Value("${server.url}")
    String serverURL;

    public Rocket getRocket() {
        Rocket rocket = restTemplate.getForObject(serverURL, Rocket.class);
        try {
            mapper.writeValue(new File("rocket.json"), rocket);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rocket;
    }
}
