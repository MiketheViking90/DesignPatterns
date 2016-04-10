package domain.actions.decorator.impl;

import domain.actions.WeaponBehavior;
import domain.actions.decorator.WeaponDecorator;

public class IceModifier extends WeaponDecorator {

    public IceModifier(WeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void useWeapon() {
        weapon.useWeapon();
        System.out.println(" PLUS ICE DAMAGE!");
    }

}
