package states.impl;

import domain.impl.GumballMachine;
import states.State;

public class WinnerState extends State {

    public WinnerState(GumballMachine gumballMachine) {
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
            System.out.println("Winner winner, chicken dinner. Two gumballs dispensing through slot!");
            gumballMachine.decrementCount();
            gumballMachine.decrementCount();
            switchToNoQuarterState();
        } else {
            System.out.println("Sold out.");
            switchToSoldOutState();
        }
    }
}
