package reporting.impl;

import domain.impl.GumballMachine;

public class GumballMonitor {

    private static final String DISPLAY_FORMAT = "Gumball Machine: %s\n"
            + " Current inventory: %d\n"
            + "Current state: %s";

    private GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        String msg = String.format(DISPLAY_FORMAT,
                gumballMachine.getLocation(),
                gumballMachine.getCount(),
                gumballMachine.getState());

        System.out.println(msg);
    }
}
