package pt.up.fe.ldts.example4;

public class Person {
    private final String name;
    private final String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public boolean login(String username, String password) {
        return false;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
