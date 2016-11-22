package command.impl;

import command.Command;

public class NullCommand implements Command {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
