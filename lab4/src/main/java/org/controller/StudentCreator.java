package org.controller;

import org.model.*;

public class StudentCreator implements Creator<Student> {
    @Override
    public Student create(String name, Human head) {


        return new Student(name, head.getLastName(), head.getMiddleName(), head.getSex(), null);
    }
}






