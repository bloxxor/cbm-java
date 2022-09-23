package Dicethrower;

import java.util.Random;

public class Player {

    public int getCurrentThrow() {
        return new Random().nextInt(6) + 1;
    }

}
