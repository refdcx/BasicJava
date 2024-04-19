package org;

import org.controller.*;
import org.model.*;
import org.junit.Test;

import java.io.IOException;

public class UniversityTest {

    @Test
    public void testJsonSerializationDeserialization() throws IOException {
        University oldUniversity = createOldUniversity();

        JsonManager.writeToJson(oldUniversity, "oldUniversity.json");

        University newUniversity = JsonManager.readFromJson(University.class, "oldUniversity.json");


        if(oldUniversity.equals(newUniversity));


    }

    public static University createOldUniversity() {

        Human universityHead = new Human("John", "Doe", "Smith", Sex.MALE)
        {
            public void work() {

                System.out.println("University head is working...");
            }

        };
        Human studentHead1 = new Human("Kick", "Butowski", "Smith", Sex.MALE){};
        Human studentHead2 = new Human("Adam", "Sadler", "Eugene", Sex.MALE){};
        Human studentHead3 = new Human("Alice", "Wonrdenlander", "Alex", Sex.FEMALE){};
        Human studentHead4 = new Human("Patric", "Stars", "Family", Sex.MALE){};


        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.create("Sample University", universityHead);


        FacultyCreator facultyCreator = new FacultyCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();

        Faculty faculty1 = facultyCreator.create("Faculty of Science", universityHead);
        Department department1 = departmentCreator.create("Department of Physics", universityHead);
        Department department2 = departmentCreator.create("Department of Chemistry", universityHead);

        Faculty faculty2 = facultyCreator.create("Faculty of Arts", universityHead);
        Department department3 = departmentCreator.create("Department of Literature", universityHead);
        Department department4 = departmentCreator.create("Department of History", universityHead);


        GroupCreator groupCreator = new GroupCreator();
        StudentCreator studentCreator = new StudentCreator();

        Group group1 = groupCreator.create("Group A", universityHead);
        Student student1 = studentCreator.create("Kick", studentHead1);

        Group group2 = groupCreator.create("Group B", universityHead);
        Student student2 = studentCreator.create("Adam", studentHead2);

        Group group3 = groupCreator.create("Group C", universityHead);
        Student student3 = studentCreator.create("Alice", studentHead3);

        Group group4 = groupCreator.create("Group D", universityHead);
        Student student4 = studentCreator.create("Patric", studentHead4);


        return university;
    }
}