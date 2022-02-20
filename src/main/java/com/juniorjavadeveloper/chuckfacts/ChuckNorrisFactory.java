package com.juniorjavadeveloper.chuckfacts;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class ChuckNorrisFactory {

    private final Faker faker = new Faker();

    public Response getFact() {
        return new Response(faker.chuckNorris().fact());
    }

    public Response getFactList(int size) {
        int listSize = size < 1 || size > 20 ? 20 : size;
        List<String> facts = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            facts.add(faker.chuckNorris().fact());

        }
        return new Response(facts, facts.size());
    }
}
