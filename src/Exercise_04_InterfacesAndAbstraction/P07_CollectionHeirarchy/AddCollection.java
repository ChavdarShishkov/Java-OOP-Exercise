package Exercise_04_InterfacesAndAbstraction.P07_CollectionHeirarchy;

public class AddCollection extends Collection implements Addable {
    @Override
    public int add(String item) {
        this.items.add(item);
        return this.items.size() - 1;
    }
}
