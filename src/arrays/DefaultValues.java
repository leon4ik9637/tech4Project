package arrays;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {

        String[] s = new String[5];
        System.out.println(Arrays.toString(s));

        int[] ints = new int[5];
        System.out.println(Arrays.toString(ints)); // [0, 0, 0, 0, 0]

        double[] doubles = new double[5];
        System.out.println(Arrays.toString(doubles));

        char[] chars = new char[5];
        System.out.println(Arrays.toString(chars));

        float[] floats = new float[5];
        System.out.println(Arrays.toString(floats)); // [0.0, 0.0, 0.0, 0.0, 0.0] 45.67
        floats[1] = 45.67f;
        System.out.println(Arrays.toString(floats));

    }
}
