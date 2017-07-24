package composite.composites;

import java.util.ArrayList;
import java.util.List;

public class CompositeEquipment implements Equipment {

    private List<Equipment> equipmentList = new ArrayList<>();

    @Override
    public String getName() {
        return "Composite";
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (Equipment e : equipmentList) {
            price += e.getPrice();
        }

        return price;
    }

    @Override
    public void add(Equipment component) {
        equipmentList.add(component);
    }

    @Override
    public void remove(Equipment component) {
        equipmentList.remove(component);
    }
}
