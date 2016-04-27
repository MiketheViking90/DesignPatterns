package domain.impl;

import lombok.Getter;
import lombok.Setter;
import states.State;
import states.impl.HasQuarterState;
import states.impl.NoQuarterState;
import states.impl.SoldOutState;
import states.impl.SoldState;
import states.impl.WinnerState;

public class GumballMachine {

    @Getter private State noQuarterState;
    @Getter private State hasQuarterState;
    @Getter private State soldState;
    @Getter private State soldOutState;
    @Getter private State winnerState;

    @Getter private final String location;
    @Getter @Setter private State state;
    @Getter private int count;

    public GumballMachine(String location, int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.count = count;
        state = noQuarterState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        int rand = (int) (Math.random() * 10);
        if (rand == 1) {
            state = winnerState;
        }
        state.dispense();
    }

    public void decrementCount() {
        if (count > 0) {
            count--;
        }
    }
}
