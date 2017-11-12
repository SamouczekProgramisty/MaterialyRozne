package pl.samouczekprogramisty.misc.complexity;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(BubbleSort.sort(new int[] {4, 5, 1, 2, 3})));
    }

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

}
