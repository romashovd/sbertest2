/*package com.sbrtest.app2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
@Service
public class SiteServiceRest implements MessageService {

    private final RestTemplate restTemplate;
    private final String serverUrl;

    public SiteServiceRest(
        RestTemplate restTemplate, @Value("${application.server.url}") String serverUrl
    ) {
        this.restTemplate = restTemplate;
        this.serverUrl = serverUrl;
    }

    @Override
    public List<MessageInfo> findAllRecivedMessage() {
        return restTemplate.exchange(
                    serverUrl + "/recived_message",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<MessageInfo>>() {
                    }
        ).getBody();
    }
}*/
