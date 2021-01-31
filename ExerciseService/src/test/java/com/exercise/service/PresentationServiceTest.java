package com.exercise.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(locations = "classpath:exercise-service-application-context.xml")
public class PresentationServiceTest {

    @Autowired
    private PresentationService presentationService;

    @Test
    public void testToBusinessPresentationWithItemsShouldReturnCorrectRepresentation() {
        // given
        Collection<String> items = Arrays.asList("item1", "item2");
        String expected = "item1, item2";

        // when
        String actual = presentationService.toBusinessPresentation(items);

        // then
        assertEquals(expected, actual);
    }
}
