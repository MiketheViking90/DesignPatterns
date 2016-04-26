package client;

import domain.impl.GumballMachine;

public class GumballBuyer {

    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine();

        gm.insertQuarter();
        gm.turnCrank();
        gm.dispense();

        gm.insertQuarter();
        gm.turnCrank();
        gm.dispense();

        gm.insertQuarter();
        gm.turnCrank();
        gm.dispense();
    }
}
