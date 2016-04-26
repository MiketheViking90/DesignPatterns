package states.impl;

import domain.impl.GumballMachine;
import states.State;

public class SoldOutState extends State {

    public SoldOutState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.err.println("Sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.err.println("No quarter inserted.");
    }

    @Override
    public void turnCrank() {
        System.err.println("Sold out");
    }

    @Override
    public void dispense() {
        System.err.println("Sold out");
    }
}
