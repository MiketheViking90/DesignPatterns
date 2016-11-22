package boiler;

import lombok.Getter;

public class ChocolateBoiler {

    private volatile static ChocolateBoiler instance;

    @Getter private boolean isEmpty;
    @Getter private boolean isBoiled;

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null) {
                    instance = new ChocolateBoiler();
                }
            }
        }
        return instance;
    }

    private ChocolateBoiler() {
        isEmpty = true;
        isBoiled = false;
    }

    public void fill() {
        if (isEmpty) {
            isEmpty = false;
            isBoiled = false;
        }
    }
}
