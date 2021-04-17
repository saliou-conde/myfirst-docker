package de.iem.myfirstdocker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/docker")
public class MyFirstDockerApplicationController {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld(){

        return new ResponseEntity<>("Hello World, " +
                "this is my first docker Container in Conjunction with Spring Boot",
                HttpStatus.OK);
    }
}
