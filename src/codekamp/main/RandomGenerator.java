package codekamp.main;

import java.util.Random;

/**
 * Created by cerebro on 24/02/17.
 */
public class RandomGenerator {
    private static Random r;

    public static int getInt(int upperRange) {
        if(r == null) {
            r = new Random();
        }

        return r.nextInt(upperRange);
    }

    public static int getInt(int lowerRange, int upperRange) {
        if(r == null) {
            r = new Random();
        }

        return r.nextInt(upperRange - lowerRange) + lowerRange;
    }
}
