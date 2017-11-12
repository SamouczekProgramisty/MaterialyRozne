package pl.samouczekprogramisty.misc.complexity;

import java.util.Arrays;

public class PowerSet {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(PowerSet.powerSet(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23})));
    }

    public static int[][] powerSet(int[] numbers) {
        int two_pow_n = 1 << numbers.length;

        int[][] powerSet = new int[two_pow_n][];
        for (int subsetIndex = 0; subsetIndex < two_pow_n; subsetIndex++) {
            powerSet[subsetIndex] = pickNumbers(subsetIndex, numbers);
        }
        return powerSet;
    }

    private static int[] pickNumbers(int subsetIndex, int[] numbers) {
        int howManyOnes = 0;
        int temp = subsetIndex;
        while (temp > 0) {
            if (temp % 2 == 1) {
                howManyOnes++;
            }
            temp >>= 1;
        }

        int[] subset = new int[howManyOnes];

        for (int charIndex = 0, lastElementIndex = 0; subsetIndex > 0; charIndex++) {
            if (subsetIndex % 2 == 1) {
                subset[lastElementIndex++] = numbers[charIndex];
            }
            subsetIndex >>= 1;
        }

        return subset;
    }

}
