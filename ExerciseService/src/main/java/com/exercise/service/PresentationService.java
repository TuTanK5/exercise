package com.exercise.service;

import com.exercise.business.BusinessPresentation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class PresentationService {

    @Autowired
    private BusinessPresentation businessPresentation;

    public PresentationService() {

    }

    public String toBusinessPresentation(Collection<String> items) {
        return businessPresentation.joinItems(items);
    }
}
