package org.controller;

import org.model.*;

public class UniversityCreator implements Creator<University> {
    @Override
    public University create(String name, Human head) {
        return new University(name, head);
    }
}