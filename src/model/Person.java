package model;

public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private String adddress;

    public Person(){

    }

    public Person(String name, String gender, String dateOfBirth, String adddress){
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.adddress = adddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAdddress() {
        return adddress;
    }

    public void display(){
        System.out.println("Name: " + this.name
                + ", gender: " + this.gender
                + ", date of birth: " + this.dateOfBirth
                + ", address: " + this.adddress);
    }
}
