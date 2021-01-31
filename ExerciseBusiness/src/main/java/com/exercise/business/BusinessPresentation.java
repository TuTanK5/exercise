package com.exercise.business;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class BusinessPresentation {

    @Autowired
    private BusinessValidation businessValidation;

    public BusinessPresentation() {

    }

    public String joinItems(Collection<String> items) {
        if (!businessValidation.isValid(items)) {
            return "";
        }

        if (items == null || items.isEmpty()) {
            return "";
        }

        return String.join(", ", items);
    }
}
