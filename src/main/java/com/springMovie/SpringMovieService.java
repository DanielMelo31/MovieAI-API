package com.springMovie;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface SpringMovieService {

    @UserMessage("""
            Generate a welcome message for a movie platform SpringMovie.
            Use atleast 120 characters.
            """)
    String generateGreeting();
}
