package client.impl;

import command.Command;
import command.impl.CeilingFanCommand;
import command.impl.GarageDoorCommand;
import command.impl.LightCommand;
import command.impl.StereoCommand;
import invoker.impl.PolyInputRemoteControl;
import receiver.impl.CeilingFan;
import receiver.impl.GarageDoor;
import receiver.impl.KitchenLight;
import receiver.impl.LivingRoomLight;
import receiver.impl.Stereo;

public class PolyInputRemoteControlTest {

    public static void main(String[] args) {
        PolyInputRemoteControl rc = getPresetRemoteControl();

        rc.pressButton1();
        rc.pressButton2();
        rc.pressButton4();
        rc.pressButton3();
        rc.undo();
        rc.undo();
        rc.undo();
    }

    private static PolyInputRemoteControl getPresetRemoteControl() {
        PolyInputRemoteControl rc = PolyInputRemoteControl.getInstance();

        Command command1 = getKitchenLightCommand();
        rc.setCommand(1, command1);

        Command command2 = getLivingRoomLightCommand();
        rc.setCommand(2, command2);

        Command command3 = getGarageDoorCommand();
        rc.setCommand(3, command3);

        Command command4 = getStereoCommand();
        rc.setCommand(4, command4);

        Command command5 = getCeilingFanCommand();
        rc.setCommand(5, command5);
        return rc;
    }

    private static Command getKitchenLightCommand() {
        KitchenLight light = new KitchenLight();
        return new LightCommand(light);
    }

    private static Command getLivingRoomLightCommand() {
        LivingRoomLight light = new LivingRoomLight();
        return new LightCommand(light);
    }

    private static Command getGarageDoorCommand() {
        GarageDoor garageDoor = new GarageDoor();
        return new GarageDoorCommand(garageDoor);
    }

    private static Command getStereoCommand() {
        Stereo stereo = new Stereo();
        return new StereoCommand(stereo);
    }

    private static Command getCeilingFanCommand() {
        CeilingFan fan = new CeilingFan();
        return new CeilingFanCommand(fan);
    }
}
