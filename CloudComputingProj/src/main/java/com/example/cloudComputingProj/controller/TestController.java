package com.example.cloudComputingProj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping(value = "/{path}")
    public void testPath(@PathVariable String path){
        File file = new File(path);
        file.
    }

}
