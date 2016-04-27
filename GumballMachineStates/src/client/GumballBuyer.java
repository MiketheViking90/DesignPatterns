package client;

import domain.impl.GumballMachine;
import reporting.impl.GumballMonitor;

public class GumballBuyer {

    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine("Seattle", 12);

        gm.insertQuarter();
        gm.turnCrank();
        gm.dispense();

        gm.insertQuarter();
        gm.turnCrank();
        gm.dispense();

        gm.insertQuarter();
        gm.turnCrank();
        gm.dispense();

        GumballMonitor monitor = new GumballMonitor(gm);
        monitor.report();
    }
}
