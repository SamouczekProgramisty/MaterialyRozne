package pl.samouczekprogramisty.dry;

public class DryExample {
    public static String convertWET(int decimalNumber, int toBase) {
        StringBuilder binaryRepresentation = new StringBuilder();
        int currentNumber;

        if (decimalNumber == 0) {
            binaryRepresentation.append(decimalNumber);
        } else if (decimalNumber > 0) {
            while (decimalNumber > 0) {
                currentNumber = decimalNumber % toBase;
                decimalNumber = decimalNumber / toBase;
                binaryRepresentation.append(currentNumber);
            }
        } else if (decimalNumber < 0) {
            decimalNumber = decimalNumber * -1;
            while (decimalNumber > 0) {
                currentNumber = decimalNumber % toBase;
                decimalNumber = decimalNumber / toBase;
                binaryRepresentation.append(currentNumber);
            }
            binaryRepresentation.append("-");
        }
        return binaryRepresentation.reverse().toString();
    }

    public static String convertDRY(int decimalNumber, int toBase) {
        StringBuilder representation = new StringBuilder();
        int numberToConvert = Math.abs(decimalNumber);

        do {
            int divisionReminder = numberToConvert % toBase;
            numberToConvert = numberToConvert / toBase;
            representation.append(divisionReminder);
        } while (numberToConvert != 0);

        if (decimalNumber < 0) {
            representation.append("-");
        }
        return representation.reverse().toString();
    }

}
