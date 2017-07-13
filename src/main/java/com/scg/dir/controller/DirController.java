package com.scg.dir.controller;

import com.scg.dir.model.Dir;
import com.scg.dir.model.DirMessage;
import com.scg.dir.service.DirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by marcus on 7/12/2017 AD.
*/
@RestController()
public class DirController {


    @Autowired
    DirService dirService;

    public DirService getDirService() {
        return dirService;
    }

    public void setDirService(DirService dirService) {
        this.dirService = dirService;
    }

    @GetMapping("/dir/{id}")
    ResponseEntity getDirById (@PathVariable int id) {
//        Dir dir = new Dir(1,"NGOLAMA","http://test/xxxx.xls","This is test DIR", "RE");
//
//
//        return new ResponseEntity(dir,HttpStatus.OK);

        ResponseEntity dir = dirService.getDirFromId(id);
        return dir;


    }


    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody String docid, @RequestBody String description, @RequestBody String status, @RequestBody String user
        ,@RequestBody String link) {

        return new ResponseEntity(description,HttpStatus.OK);


    }

}
