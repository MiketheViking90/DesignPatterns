package domain.actions.decorator;

import domain.actions.WeaponBehavior;

public abstract class WeaponDecorator implements WeaponBehavior {

    protected WeaponBehavior weapon;

    public WeaponDecorator(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    @Override
    public abstract void useWeapon();

}
