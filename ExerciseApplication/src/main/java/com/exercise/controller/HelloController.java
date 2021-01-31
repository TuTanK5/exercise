package com.exercise.controller;

import com.exercise.service.PresentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private PresentationService presentationService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/items")
    public String items() {
        List<String> items = Arrays.asList("item1", "item2", "item3");
        return presentationService.toBusinessPresentation(items);
    }
}
