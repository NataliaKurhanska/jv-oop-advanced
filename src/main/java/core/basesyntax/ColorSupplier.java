package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int indexOfColors = random.nextInt(Colors.values().length);
        return Colors.values()[indexOfColors].toString();
    }
}
