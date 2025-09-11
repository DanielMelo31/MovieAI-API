package com.springMovie.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springMovie.model.service.SpringMovieAIService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class helloController {
    private final SpringMovieAIService aiService;

    public helloController(SpringMovieAIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return this.aiService.generateGreeting();
    }
}
