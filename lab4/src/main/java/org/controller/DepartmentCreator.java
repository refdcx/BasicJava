package org.controller;
import org.model.*;

public class DepartmentCreator implements Creator<Department> {
    @Override
    public Department create(String name, Human head) {
        return new Department(name, head);
    }
}
