package command.impl;

import java.util.Collections;
import java.util.List;

import command.Command;
import lombok.Getter;

public class PartyModeMacroCommand implements Command {

    @Getter List<Command> commands;

    @Override
    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }

    @Override
    public void undo() {
        Collections.reverse(commands);
        for (Command c : commands) {
            c.execute();
        }
        Collections.reverse(commands);
    }

    public PartyModeMacroCommand(List<Command> commands) {
        this.commands = commands;
    }
}
