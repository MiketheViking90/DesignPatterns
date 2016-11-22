package states;

import domain.impl.GumballMachine;

public abstract class State {

    protected GumballMachine gumballMachine;

    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public abstract void insertQuarter();

    public abstract void ejectQuarter();

    public abstract void turnCrank();

    public abstract void dispense();

    protected void switchToNoQuarterState() {
        System.out.println("  switch to no quarter");
        State noQuarterState = gumballMachine.getNoQuarterState();
        gumballMachine.setState(noQuarterState);
    }

    protected void switchToHasQuarterState() {
        System.out.println("  switch to has quarter");
        State hasState = gumballMachine.getHasQuarterState();
        gumballMachine.setState(hasState);
    }

    protected void switchToSoldState() {
        System.out.println("  switch to sold");
        State soldState = gumballMachine.getSoldState();
        gumballMachine.setState(soldState);
    }

    protected void switchToSoldOutState() {
        System.out.println("  switch to sold out");
        State soldOutState = gumballMachine.getSoldOutState();
        gumballMachine.setState(soldOutState);
    }

}
