package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[RANDOM.nextInt(colors.length)].name();
    }

}
