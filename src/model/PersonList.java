package model;

import java.util.Iterator;
import java.util.LinkedList;

public class PersonList {
    LinkedList<Person> listPerson = new LinkedList<Person>();

    public void inputList(String name, String gender, String dateOfBirth, String address){
        Person person = new Person(name, gender, dateOfBirth, address);
        listPerson.add(person);
    }

    public void displayPersonList(){
        Iterator<Person> iterator = listPerson.iterator();
        while (iterator.hasNext()){
            iterator.next().display();
        }
    }
}
