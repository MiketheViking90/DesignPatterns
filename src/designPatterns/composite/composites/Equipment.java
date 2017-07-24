package composite.composites;

public interface Equipment {

    String getName();

    double getPrice();

    void add(Equipment component);

    void remove(Equipment component);

}
