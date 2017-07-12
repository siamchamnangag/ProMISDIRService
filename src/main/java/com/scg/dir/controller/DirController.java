package com.scg.dir.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcus on 7/12/2017 AD.
*/
@RestController()
@RequestMapping("dir")
public class DirController {

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity test(){
        return new ResponseEntity("DIR Service", HttpStatus.OK);
    }

}
