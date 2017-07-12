package com.scg.dir.service;

import com.scg.dir.model.Dir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by khan on 7/12/2017 AD.
 */
@Component
public class DirService {
    public DirService(){

    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    private Dir dir;

    @Autowired
    RestTemplate restTemplate;

    public Dir getDirFromId(int id) {
        //get DIR from API

        String url = "http://document-api.cloudhub.io/mock/v1/sap/dirs/" + id;
        //HttpHeaders headers = new HttpHeaders();
        //headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        //HttpEntity<?> entity = new HttpEntity<>(headers);

        Dir response = restTemplate.getForObject(
                url, Dir.class);

        System.out.println();

        return response;
    }

    public Dir getDir() {
        return dir;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
