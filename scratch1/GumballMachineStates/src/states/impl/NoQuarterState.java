package states.impl;

import domain.impl.GumballMachine;
import states.State;

public class NoQuarterState extends State {

    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted.");
        switchToHasQuarterState();
    }

    @Override
    public void ejectQuarter() {
        System.err.println("No quarter inserted.");
    }

    @Override
    public void turnCrank() {
        System.out.println("No-op because no quarter inserted.");
    }

    @Override
    public void dispense() {
        System.err.println("Pay first.");
    }

}
