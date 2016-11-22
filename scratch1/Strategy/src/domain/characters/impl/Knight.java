package domain.characters.impl;

import domain.actions.impl.Lance;
import domain.characters.Player;

public class Knight extends Player {

    public Knight() {
        weapon = new Lance();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }

}
