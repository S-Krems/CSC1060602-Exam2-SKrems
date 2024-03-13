import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question 5: stringToArray
        //Write a method stringToArray that takes a string argument
        //and returns an array of char where each element of
        //the array is the characters of the string in order.
        //The array should be sized to exactly the length of the string.

        System.out.println("Question 5: stringToArray");
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] charArray = stringToArray(inputString);
        System.out.print("Result: [");
        for (int i = 0; i < charArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print("'" + charArray[i] + "'");
        }
        System.out.println("]");

        // Question 6: generateArrayWithBounds
        // Write a method named generateArrayWithBounds that takes three integer arguments,start,end,
        // and step and returns an array of integers.
        // Given start and end numbers, return a new array containing the sequence of integers
        // from start up to but not including end, stepping-step numbers in between each number,
        // so start=5, end=10, and step=1 yields [5, 6, 7, 8, 9], but with the same start and end
        // but with step=2 would yield [5, 7, 9}. You can assume the end number will always be greater
        // than or equal to the start number. If step would skip the end number, then do not include it.
        // Note that a length-0 array is valid.

        System.out.println("\nQuestion 6: generateArrayWithBounds");
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();
        System.out.print("Enter the step: ");
        int step = scanner.nextInt();

        int[] resultArray = generateArrayWithBounds(start, end, step);
        System.out.print("Result: [");
        for (int i = 0; i < resultArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(resultArray[i]);
        }
        System.out.println("]");

        scanner.close();
    }

    // Question 5: stringToArray
    public static char[] stringToArray(String inputString) {
        return inputString.toCharArray();
    }

    // Question 6: generateArrayWithBounds
    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int size = (end - start + step - 1) / step;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = start + i * step;
        }
        return result;
    }
}
