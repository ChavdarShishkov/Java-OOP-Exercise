package Exercise_04_InterfacesAndAbstraction.P04_FoodShortage;

public class Rebel implements Person, Buyer {
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group, int food) {
        this.setName(name);
        this.setAge(age);
        this.setGroup(group);
        this.setFood(food);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setGroup(String group) {
        this.group = group;
    }

    private void setFood(int food) {
        this.food = food;
    }

    @Override
    public void BuyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
