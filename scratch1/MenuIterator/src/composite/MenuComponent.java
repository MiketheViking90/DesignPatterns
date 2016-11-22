package composite;

public interface MenuComponent {

    public String getName();

    public String getDescription();

    public double getPrice();

    public boolean isVegetarian();

    public void add(MenuComponent menuComponent);

    public void remove(MenuComponent menuComponent);

}
