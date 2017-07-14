package com.scg.dir.controller;

import com.scg.dir.model.Dir;
import com.scg.dir.service.DirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        ResponseEntity dir = dirService.getDirFromId(id);
        return dir;
    }


    @RequestMapping(value = "/dir", method = RequestMethod.POST)
    ResponseEntity createNewDir (@RequestBody Dir dir) {

        ResponseEntity postDir = dirService.createDir(dir);

        return postDir;
    }

}
