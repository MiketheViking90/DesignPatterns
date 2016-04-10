package domain.actions.impl;

import domain.actions.WeaponBehavior;

public class Staff implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Magic staff attack!");
    }

}
