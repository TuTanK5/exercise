package com.exercise.business;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(locations = "classpath:exercise-business-application-context.xml")
public class BusinessPresentationTest {

    @Autowired
    private BusinessPresentation businessPresentation;

    @Test
    public void testJoinItemsWithNullShouldReturnEmptyString() {
        // given
        Collection<String> items = null;
        String expected = "";

        // when
        String actual = businessPresentation.joinItems(items);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testJoinItemsWithEmptyShouldReturnEmptyString() {
        // given
        Collection<String> items = new ArrayList<>();
        String expected = "";

        // when
        String actual = businessPresentation.joinItems(items);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void testJoinItemsWithItemsShouldReturnCorrectRepresentation() {
        // given
        Collection<String> items = Arrays.asList("item1", "item2");
        String expected = "item1, item2";

        // when
        String actual = businessPresentation.joinItems(items);

        // then
        assertEquals(expected, actual);
    }
}
