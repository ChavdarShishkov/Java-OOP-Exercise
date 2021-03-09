package Exercise_04_InterfacesAndAbstraction.P03_birthdayCelebrations;

public class Pet implements Birthable {

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.setName(name);
        this.setBirthDate(birthDate);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
