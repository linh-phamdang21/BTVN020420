package model;

public class Student extends Person {
    private int ID;
    private double GPA;
    private String email;

    public Student(){

    }

    public Student (int ID, double GPA, String email){
        this.ID = ID;
        this.GPA = GPA;
        this.email = email;
    }

    public Student(int ID, String name,String gender, String dateOfBirth, double GPA){
        this.setID(ID);
        this.setName(name);
        this.setGender(gender);
        this.setDateOfBirth(dateOfBirth);
        this.GPA = GPA;
    }

    public Student (int ID, String name, String gender, String dateOfBirth, double GPA, String email, String address){
        super(name,gender, dateOfBirth,address);
        this.ID = ID;
        this.GPA = GPA;
        this.email = email;
    }

    public void editStudent(String name, String dateOfBirth, double GPA){
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.GPA = GPA;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public double getGPA() {
        return GPA;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkScholarship(){
        if (this.GPA >= 8.0){
            return true;
        }
        return false;
    }

    public void display1(){
        System.out.println("ID: " + this.ID
                + ", name: " + this.getName()
                + ", gender" + this.getGender()
                + ", date of birth: " + this.getDateOfBirth()
                + ", GPA: " + this.GPA);
    }

    public void display2(){
        System.out.println("ID: " + this.ID
                + ", name: " + this.getName()
                + ", gender: " + this.getGender()
                + ", date of birth: " + this.getDateOfBirth()
                + ", GPA: " + this.GPA
                + ", email: " + this.email
                + ", address: " + this.getAdddress());
    }
}
