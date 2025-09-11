package com.springMovie.model.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface SpringMovieAIService {

    @UserMessage("""
            Generate a welcome message for a movie platform SpringMovie.
            Use atleast 120 characters.
            """)
    String generateGreeting();
}
