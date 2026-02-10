public class Contact {
    String name;
    String firstName;
    String address;
    int phone;

    Contact(String name, String firstName, String address, int phone) {
        this.name = name;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
    }

    String getAddress() {
        return this.address;
    }

    String getFullName() {
        return this.name + this.firstName;
    }

    void setPhone(int phone) {
        this.phone = phone;
    }
}
