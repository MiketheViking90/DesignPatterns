package command.impl;

import command.Command;
import lombok.Setter;
import receiver.impl.Stereo;

public class StereoCommand implements Command {

    private static final String DISPLAY_FORMAT = "%s is open: %s";

    @Setter private Stereo stereoReceiver;

    @Override
    public void execute() {
        stereoReceiver.eject();

        printExecution();
    }

    @Override
    public void undo() {
        execute();
    }

    public StereoCommand(Stereo stereo) {
        stereoReceiver = stereo;
    }

    private void printExecution() {
        String msg = String.format(DISPLAY_FORMAT, stereoReceiver.getName(), stereoReceiver.isOpen());
        System.out.println(msg);
    }

}
