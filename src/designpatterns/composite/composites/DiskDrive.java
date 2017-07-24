package designpatterns.composite.composites;

public class DiskDrive implements Equipment {

    @Override
    public String getName() {
        return "DiskDrive";
    }

    @Override
    public double getPrice() {
        return 12.5;
    }

    @Override
    public void add(Equipment component) {
        return;
    }

    @Override
    public void remove(Equipment component) {
        return;
    }
}
