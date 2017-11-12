package pl.samouczekprogramisty.misc.complexity;

public class ArraySum {

    public static void main(String[] args) {
        System.out.println(ArraySum.sum(new int[] {1, 2, 5, 6, 8, 9, 4, 19}));
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
