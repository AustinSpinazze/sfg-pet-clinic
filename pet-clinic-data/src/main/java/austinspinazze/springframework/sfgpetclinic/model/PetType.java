package austinspinazze.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity {

    // PetType object model
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
