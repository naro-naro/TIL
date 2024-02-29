package com.estsoft.hellospring.controller;

import com.estsoft.hellospring.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {
    @GetMapping("/hi")    // GET localhost:8080/hi?name=queryparameter
    public String test(@RequestParam(value = "name", defaultValue = "world!") String name) {
        return String.format("Hello %s", name);
    }

    // Post localhost:8080/hi
    @PostMapping("/hi")
    public String testPost(@RequestBody String value) {
        // json -> java
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            Person person = objectMapper.readValue(value, Person.class);
            System.out.println("person = " + person);
        } catch(JsonProcessingException e){
            System.out.println(e.getMessage());
        }
        System.out.println("value" + value);
        return value; //json
    }

}
