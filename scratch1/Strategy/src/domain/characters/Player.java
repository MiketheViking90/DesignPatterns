package domain.characters;

import domain.actions.WeaponBehavior;
import lombok.Setter;

public abstract class Player {

    private String name;
    @Setter protected WeaponBehavior weapon;

    public abstract void fight();

}
