package org.model;

import java.util.Arrays;

public class Student extends Human {
    private Group group;

    public Student(String firstName, String lastName, String middleName, Sex sex, Group group) {
        super(firstName, lastName, middleName, sex);
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String toString() {
    String[] studinfo = new String[4];
        studinfo[0]=firstName;
        studinfo[1]=lastName;
        studinfo[2]=middleName;
        studinfo[3]= String.valueOf(sex);

        return Arrays.toString(studinfo);
    }
}


