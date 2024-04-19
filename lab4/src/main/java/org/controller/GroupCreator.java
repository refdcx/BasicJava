package org.controller;

import org.model.*;

public class GroupCreator implements Creator<Group> {
    @Override
    public Group create(String name, Human head) {
        return new Group(name, head);
    }
}