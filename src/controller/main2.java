package controller;

import model.StudentList;

public class main2 {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.displayStudentList();
        System.out.println("Add students");
        studentList.inputList(1,"Linh", "Male","21/04/1996", 7.85);
        studentList.inputList(2,"Nguyen","Male", "23/08/1996", 8.32);
        studentList.inputList(3,"Thu", "Female", "21/07/1996", 8.15);
        studentList.displayStudentList();

        System.out.println("\nAmount students get Scholarship");
        studentList.checkScholarship();
        //studentList.editStudent(1);
        //studentList.displayStudentList();

        System.out.println("\nSearch student by ID");
        studentList.searchByID(2);

        System.out.println("\nSearch student by Name");
        studentList.searchByName("Nguyen");

        System.out.println("\nStudents who get Scholarship");
        studentList.getScholarshipList();

        System.out.println("\nStudents who are Female");
        studentList.getFemaleList();
    }
}