package com.scg.dir.controller;

import com.scg.dir.model.Dir;
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

        Dir dir = dirService.getDirFromId(id);
        return new ResponseEntity(dir,HttpStatus.OK);

//

    }

}