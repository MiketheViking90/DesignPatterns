package composite.client;

import composite.composites.CompositeEquipment;
import composite.composites.DiskDrive;
import composite.composites.Equipment;

public class User {

    public static void main(String[] args) {
        Equipment diskDrive1 = new DiskDrive();
        Equipment diskDrive2 = new DiskDrive();
        Equipment diskDrive3 = new DiskDrive();

        Equipment composite = new CompositeEquipment();
        composite.add(diskDrive1);
        composite.add(diskDrive2);
        composite.add(diskDrive3);

        System.out.println(composite.getName());
        System.out.println(composite.getPrice());
    }

}
