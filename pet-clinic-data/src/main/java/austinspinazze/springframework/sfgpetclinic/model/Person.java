package austinspinazze.springframework.sfgpetclinic.model;

public class Person extends BaseEntity {

    // Person object model
    private String firstName;
    private String lastName;

    // Getting and Setting data methods for the Person model
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
