package org.controller;

import org.model.*;

public class Run {
    public static void main(String[] args) {

        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {

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


        System.out.println("University: " + university.getName());
        System.out.println("Head: " + university.getHead().getFirstName() + " " + university.getHead().getLastName());
        System.out.println(" "+faculty1);
        System.out.println("Head: " + faculty1.getHead().getFirstName() + " " + faculty1.getHead().getLastName());
        System.out.println(" "+department1);
        System.out.println("Head: " + department1.getHead().getFirstName() + " " + department1.getHead().getLastName());
        System.out.println(" "+group1);
        System.out.println("Head: " + group1.getHead().getFirstName() + " " + group1.getHead().getLastName());
            System.out.println("Student: " + student1 );
        System.out.println(" "+department2);
        System.out.println("Head: " + department2.getHead().getFirstName() + " " + department2.getHead().getLastName());
        System.out.println(" "+group2);
        System.out.println("Head: " + group2.getHead().getFirstName() + " " + group2.getHead().getLastName());
            System.out.println("Student: " + student2 );
        System.out.println(" "+faculty2);
        System.out.println("Head: " + faculty2.getHead().getFirstName() + " " + faculty2.getHead().getLastName());
        System.out.println(" "+department3);
        System.out.println("Head: " + department3.getHead().getFirstName() + " " + department3.getHead().getLastName());
        System.out.println(" "+group3);
        System.out.println("Head: " + group3.getHead().getFirstName() + " " + group3.getHead().getLastName());
            System.out.println("Student: " + student3 );
        System.out.println(" "+group4);
        System.out.println("Head: " + group4.getHead().getFirstName() + " " + group4.getHead().getLastName());
            System.out.println("Student: " + student4 );

    }
}
