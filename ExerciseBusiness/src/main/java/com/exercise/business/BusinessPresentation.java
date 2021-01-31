package com.exercise.business;

import java.util.Collection;

public class BusinessPresentation {

    public BusinessPresentation() {

    }

    public String joinItems(Collection<String> items) {
        if (items == null || items.isEmpty()) {
            return "";
        }

        return String.join(", ", items);
    }
}
