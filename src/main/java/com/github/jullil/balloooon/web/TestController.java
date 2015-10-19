package com.github.jullil.balloooon.web;

import com.github.jullil.balloooon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> testGet() {
        return new ResponseEntity<>("GET is working", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> testPost() {
        return new ResponseEntity<>("POST is working", HttpStatus.OK);
    }
}