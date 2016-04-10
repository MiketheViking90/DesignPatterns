package activity;

import domain.actions.WeaponBehavior;
import domain.actions.decorator.impl.IceModifier;
import domain.actions.impl.Staff;
import domain.characters.Player;
import domain.characters.impl.Wizard;

public class FantasyGame {

    public static void main(String[] args) {
        playFantasy();
    }

    private static void playFantasy() {
        Player wizard = new Wizard();
        wizard.fight();

        WeaponBehavior staff = new Staff();
        staff = new IceModifier(staff);
        wizard.setWeapon(staff);

        wizard.fight();
    }
}
