package order;

import lombok.Getter;

public enum Size {

    TALL (2),
    MEDIUM (1.5),
    SHORT (1);

    @Getter private double multiplier;

    private Size(double multiplier) {
        this.multiplier = multiplier;
    }
}
