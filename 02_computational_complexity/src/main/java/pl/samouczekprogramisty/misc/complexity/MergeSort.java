package pl.samouczekprogramisty.misc.complexity;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }
        int[] first = new int[numbers.length / 2];
        int[] second = new int[numbers.length - first.length];
        for (int i = 0; i < first.length; i++) {
            first[i] = numbers[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = numbers[first.length + i];
        }
        return merge(sort(first), sort(second));
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        for (int indexFirst = 0, indexSecond = 0, indexMerged = 0; indexMerged < merged.length; indexMerged++) {
            if (indexFirst >= first.length) {
                merged[indexMerged] = second[indexSecond++];
            }
            else if (indexSecond >= second.length) {
                merged[indexMerged] = first[indexFirst++];
            }
            else if (first[indexFirst] <= second[indexSecond]) {
                merged[indexMerged] = first[indexFirst++];
            }
            else {
                merged[indexMerged] = second[indexSecond++];
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(BubbleSort.sort(new int[] {4, 5, 1, 2, 3})));
    }
}
