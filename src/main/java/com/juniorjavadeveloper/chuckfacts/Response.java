package com.juniorjavadeveloper.chuckfacts;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;

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

    public String getFact() {
        return fact;
    }

    public List<String> getFacts() {
        return facts;
    }

    public Integer getSize() {
        return size;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
