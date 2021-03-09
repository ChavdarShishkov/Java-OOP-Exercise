package Exercise_04_InterfacesAndAbstraction.P03_birthdayCelebrations;

public class Robot implements Identifiable {
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.setId(id);
        this.setModel(model);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
