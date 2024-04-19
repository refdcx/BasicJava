package org.controller;

import org.model.*;

public class FacultyCreator implements Creator<Faculty> {
    @Override
    public Faculty create(String name, Human head) {
        return new Faculty(name, head);
    }
}
