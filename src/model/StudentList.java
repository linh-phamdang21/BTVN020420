package model;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static final int DEFAULT_SIZE = 20;
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void inputList(int ID, String name, String gender, String dateOfBirth, double GPA){
        Student student = new Student(ID, name, gender, dateOfBirth, GPA);
        students.add(student);
    }

    public void displayStudentList(){
        for (int i = 0; i < students.size(); i++){
            Student student = (Student) students.get(i);
            student.display1();
        }
    }

    public void checkScholarship(){
        int scholarshipAmount = 0;
        for (int i = 0; i < students.size(); i++){
            Student student = (Student) students.get(i);
            if (student.checkScholarship()){
                scholarshipAmount++;
            }
        }
        System.out.println("Amount of Students gets Scholarship: " + scholarshipAmount);
    }

    public void editStudent(int index){
        for (int i = 0; i < students.size(); i++){
            Student student = (Student) students.get(i);
            if (student.getID() == index){
                System.out.println("Edit Student ID: " + student.getID() + " Information: ");
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Date of birth: ");
                String dateOfBirth = scanner.nextLine();
                System.out.println("GPA: ");
                double GPA = scanner.nextDouble();
                student.editStudent(name,dateOfBirth,GPA);
            }
        }
    }

    public void searchByID(int ID){
        for (int i = 0; i < students.size(); i++){
            Student student = (Student) students.get(i);
            if (student.getID() == ID){
                student.display1();
            }
        }
    }

    public void searchByName(String name){
        for (int i = 0; i < students.size(); i++){
            Student student = (Student) students.get(i);
            if (student.getName() == name){
                student.display1();
            }
        }
    }

    public void getScholarshipList(){
        for (int i = 0; i < students.size(); i++){
            Student student = (Student) students.get(i);
            if (student.checkScholarship()){
                student.display1();
            }
        }
    }

    public void getFemaleList(){
        for (int i = 0; i < students.size(); i++){
            Student student = (Student) students.get(i);
            if (student.getGender() == "Female"){
                student.display1();
            }
        }
    }
}
