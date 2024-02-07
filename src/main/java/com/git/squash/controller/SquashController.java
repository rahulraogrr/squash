package com.git.squash.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/squash")
public class SquashController {

    @GetMapping("/getMessage/{message}")
    public String getSquashMessage(@RequestParam String message){
        return "Hello World "+message;
    }

}
