package client.impl;

import java.util.Arrays;
import java.util.List;

import command.Command;
import command.impl.CeilingFanCommand;
import command.impl.GarageDoorCommand;
import command.impl.LightCommand;
import command.impl.PartyModeMacroCommand;
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

        rc.pressButton6();
        System.out.println();
        rc.undo();
        System.out.println();
        rc.pressButton6();
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

        Command command6 = getPartyModeCommand();
        rc.setCommand(6, command6);

        return rc;
    }

    private static Command getPartyModeCommand() {
        KitchenLight light = new KitchenLight();
        Command lc = new LightCommand(light);

        CeilingFan fan = new CeilingFan();
        Command cfc = new CeilingFanCommand(fan);

        GarageDoor garageDoor = new GarageDoor();
        Command gdc = new GarageDoorCommand(garageDoor);

        List<Command> partyModeCommands = Arrays.asList(lc, cfc, gdc);
        PartyModeMacroCommand pmmc = new PartyModeMacroCommand(partyModeCommands);
        return pmmc;
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
