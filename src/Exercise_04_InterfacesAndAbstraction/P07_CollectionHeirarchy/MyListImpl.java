package Exercise_04_InterfacesAndAbstraction.P07_CollectionHeirarchy;

public class MyListImpl extends Collection implements MyList {
    @Override
    public int getUsed() {
        return this.items.size();
    }

    @Override
    public int add(String item) {
        this.items.add(0, item);
        return 0;
    }

    @Override
    public String remove() {
        return this.items.remove(0);
    }
}
