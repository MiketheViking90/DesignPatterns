package domain.actions.impl;

import domain.actions.WeaponBehavior;

public class Lance implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Lance attack!");
    }

}
