package invoker.impl;

import command.Command;
import command.impl.NullCommand;

public class PolyInputRemoteControl {

    private static final int NUM_INPUTS = 7;

    public static volatile PolyInputRemoteControl instance;

    private Command[] commands;

    public static PolyInputRemoteControl getInstance() {
        if (instance == null) {
            synchronized(PolyInputRemoteControl.class) {
                if (instance == null) {
                    instance = new PolyInputRemoteControl();
                }
            }
        }
        return instance;
    }

    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    public void pressButton1() {
        Command command = commands[1];
        command.execute();
    }

    public void pressButton2() {
        Command command = commands[2];
        command.execute();
    }

    public void pressButton3() {
        Command command = commands[3];
        command.execute();
    }

    public void pressButton4() {
        Command command = commands[4];
        command.execute();
    }

    public void pressButton5() {
        Command command = commands[5];
        command.execute();
    }

    public void pressButton6() {
        Command command = commands[6];
        command.execute();
    }

    public void pressButton7() {
        Command command = commands[7];
        command.execute();
    }

    public void toggleAll() {
        for (Command c : commands) {
            c.execute();
        }
    }

    private PolyInputRemoteControl() {
        commands = new Command[NUM_INPUTS];
        for (int i = 0; i < NUM_INPUTS; i++) {
            setCommand(i, new NullCommand());
        }
    }

}
