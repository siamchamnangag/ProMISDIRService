package com.scg.dir.controller;

import com.scg.dir.model.Dir;
import com.scg.dir.model.DirMessage;
import com.scg.dir.service.DirService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by khan on 7/12/2017 AD.
 */

public class DirControllerTest {

    @Autowired
    DirService dirService;

    @Test
    public void success_when_id_1() {
//
//        DirController dirController = new DirController();
//        Dir dir = new DirMessage(1,"testing document 1","iw","pwp", "https://github.com/siamchamnangag/ProMISFileService/raw/master/src/main/resources/PMoC_complexity_and_effort_assessment.xlsx");
//        dirController.setDirService(new MockDirService(dir));
//        ResponseEntity expected = new ResponseEntity(dir, HttpStatus.OK);
//        ResponseEntity actual = dirController.getDirById(1);
//
//
//        //Dir actual = new DirService().getDirFromId(1);
//
//        assertEquals(expected.toString(), actual.toString());

    }

//    @Test
//    public void data_not_found_when_id_2() {
//
//    }
//
//    class MockDirService extends DirService {
//        private final DirMessage dir;
//
//        @Override
//        public DirMessage getDirFromId(int id) {
//            //get DIR from API
//
//            return dir;
//        }
//
//        public MockDirService(DirMessage dir){
//            this.dir = dir;
//        }
//
//    }



}