package states.impl;

import domain.impl.GumballMachine;
import states.State;

public class HasQuarterState extends State {

    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.err.println("Cannot insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected.");
        switchToNoQuarterState();
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned to feed quarter.");
        switchToSoldState();
    }

    @Override
    public void dispense() {
        System.out.println("No quarter dispensed.");
    }

}
