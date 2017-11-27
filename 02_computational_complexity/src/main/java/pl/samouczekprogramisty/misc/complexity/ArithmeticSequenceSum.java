package pl.samouczekprogramisty.misc.complexity;

public class ArithmeticSequenceSum {

    public static void main(String[] args) {
        System.out.println(ArithmeticSequenceSum.sum(new int[] {1, 3, 5, 7, 9, 11, 13}));
    }

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        return (numbers[0] + numbers[numbers.length - 1]) * numbers.length / 2;
    }

}
