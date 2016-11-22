package domain.characters.impl;

import domain.actions.impl.Staff;
import domain.characters.Player;

public class Wizard extends Player {

    public Wizard() {
        weapon = new Staff();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }

}
