package com.github.codersparks.helloservice.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by codersparks on 08/11/2015.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public ResponseEntity<String> sayHello() {
        String helloPhrase = "Hello world!!!";

        ResponseEntity<String> responseEntity = new ResponseEntity<String>(helloPhrase, HttpStatus.OK);
        return responseEntity;

    }
}
