package pl.samouczekprogramisty.misc.complexity;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 8, 9}, 7));
    }

    public static boolean binarySearch(int[] numbers, int number) {
        int indexLow = 0;
        int indexHigh = numbers.length - 1;
        while (indexLow <= indexHigh) {
            int indexMiddle = indexLow + (indexHigh - indexLow) / 2;

            if (number < numbers[indexMiddle]) {
                indexHigh = indexMiddle - 1;
            }
            else if (number > numbers[indexMiddle]) {
                indexLow = indexMiddle + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}