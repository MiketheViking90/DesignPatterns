package invoker.impl;

import command.Command;
import lombok.Setter;

public class SimpleRemoteControl {

    @Setter Command slot;

    public void pressButton() {
        slot.execute();
    }
}
