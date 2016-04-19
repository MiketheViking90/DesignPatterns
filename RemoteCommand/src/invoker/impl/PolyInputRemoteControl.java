package invoker.impl;

import java.util.Stack;

import command.Command;
import command.impl.NullCommand;

public class PolyInputRemoteControl {

    private static final int NUM_INPUTS = 7;

    public static volatile PolyInputRemoteControl instance;

    private Command[] commands;
    private Stack<Command> undo;

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

        undo.push(command);
    }

    public void pressButton2() {
        Command command = commands[2];
        command.execute();

        undo.push(command);
    }

    public void pressButton3() {
        Command command = commands[3];
        command.execute();

        undo.push(command);
    }

    public void pressButton4() {
        Command command = commands[4];
        command.execute();

        undo.push(command);
    }

    public void pressButton5() {
        Command command = commands[5];
        command.execute();

        undo.push(command);
    }

    public void pressButton6() {
        Command command = commands[6];
        command.execute();

        undo.push(command);
    }

    public void pressButton7() {
        Command command = commands[7];
        command.execute();

        undo.push(command);
    }

    public void toggleAll() {
        for (Command c : commands) {
            c.execute();

            undo.push(c);
        }
    }

    public void undo() {
        Command lastCommand = undo.pop();
        lastCommand.undo();
    }

    private PolyInputRemoteControl() {
        commands = new Command[NUM_INPUTS];
        for (int i = 0; i < NUM_INPUTS; i++) {
            setCommand(i, new NullCommand());
        }

        undo = new Stack<>();
    }

}
