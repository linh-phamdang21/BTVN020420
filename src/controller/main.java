package controller;
import model.PersonList;
public class main {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        personList.inputList("Dang Linh", "Male", "21/04/1996", "HaNoi");
        personList.inputList("Phuong Linh", "Male", "28/08/2000", "HaNoi");
        personList.displayPersonList();

    }
}
