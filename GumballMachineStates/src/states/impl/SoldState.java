package states.impl;

import domain.impl.GumballMachine;
import states.State;

public class SoldState extends State {

    public SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait. Currently processing purchase.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait. Currently processing purchase.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please wait. Currently processing purchase.");
    }

    @Override
    public void dispense() {
        if (gumballMachine.getCount() > 0) {
            System.out.println("Gumball dispensing through slot.");
            gumballMachine.decrementCount();
            switchToNoQuarterState();
        } else {
            System.out.println("Sold out.");
            switchToSoldOutState();
        }
    }

}
