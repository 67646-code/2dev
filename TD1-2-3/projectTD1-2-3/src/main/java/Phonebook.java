import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    List<Contact> contacts;




    Phonebook(){
    this.contacts = new ArrayList<>();
    }

    void add(Contact c){
        this.contacts.add(c);
    }

    void display(){
        for (Contact c : this.contacts){
            System.out.println(c.getFullName());
        }
    }
}
