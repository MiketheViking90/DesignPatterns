package command.impl;

import command.Command;
import lombok.Setter;
import receiver.impl.CeilingFan;

public class CeilingFanCommand implements Command {

    private static final String DISPLAY_FORMAT = "%s is on: %s";

    @Setter private CeilingFan fanReceiver;

    @Override
    public void execute() {
        fanReceiver.toggle();

        printExecution();
    }

    @Override
    public void undo() {
        execute();
    }

    public CeilingFanCommand(CeilingFan fan) {
        this.fanReceiver = fan;
    }

    private void printExecution() {
        String msg = String.format(DISPLAY_FORMAT, fanReceiver.getName(), fanReceiver.isOn());
        System.out.println(msg);
    }
}
