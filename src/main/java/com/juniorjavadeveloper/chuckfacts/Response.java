package com.juniorjavadeveloper.chuckfacts;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private final String fact;
    private final List<String> facts;
    private final Integer size;
    private final LocalDateTime created;

    public Response(List<String> facts, Integer size) {
        this.fact = null;
        this.facts = facts;
        this.size = size;
        this.created = LocalDateTime.now();
    }

    public Response(String fact) {
        this.fact = fact;
        this.created = LocalDateTime.now();
        this.facts = null;
        this.size = null;
    }
}
