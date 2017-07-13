package com.scg.dir.service;

import com.scg.dir.model.CreateDirDTO;
import com.scg.dir.model.Dir;
import com.scg.dir.model.DirMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
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

    public ResponseEntity<?> createDir(Dir dir) {
        //Create new DIR
        String url = "http://document-api.cloudhub.io/mock/v1/sap/dirs/";


        ResponseEntity<?> responseEntity;

        try {
            HttpEntity<Dir> requestEntity = new HttpEntity<>(dir);
            //responseEntity = new ResponseEntity<>(new DirMessage("test"),HttpStatus.OK);

            responseEntity = new ResponseEntity<>(restTemplate.postForObject(url, requestEntity, CreateDirDTO.class),HttpStatus.OK);;
        //return restTemplate.postForObject(url, requestEntity, Dir.class);
//            response = restTemplate.getForObject(
//                    url, DirMessage.class);
        }catch (Exception ex) {

            responseEntity = new ResponseEntity<>(new DirMessage("document is not found"),HttpStatus.NOT_FOUND);

        }

        return responseEntity;
    }

    public ResponseEntity<?> getDirFromId(int id) {
        //get DIR from API
        //DirMessage response = new DirMessage();
        String url = "http://document-api.cloudhub.io/mock/v1/sap/dirs/" + id;
        //HttpHeaders headers = new HttpHeaders();
        //headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        //HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<?> responseEntity;

        try {
            responseEntity = new ResponseEntity<>(restTemplate.getForObject(
                    url, Dir.class),HttpStatus.OK);

//            response = restTemplate.getForObject(
//                    url, DirMessage.class);
        }catch (Exception ex) {

            responseEntity = new ResponseEntity<>(new DirMessage("document is not found"),HttpStatus.NOT_FOUND);

        }

        return responseEntity;
    }

    public Dir getDir() {
        return dir;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
