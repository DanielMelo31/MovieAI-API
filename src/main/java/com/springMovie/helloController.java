package com.springMovie;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class helloController {
    private final SpringMovieService aiService;

    public helloController(SpringMovieService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/")
    public String sayHello() {
        return this.aiService.generateGreeting();
    }
}
