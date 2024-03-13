import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Question 1: endOther");
        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();

        System.out.println("endOther: " + endOther(a, b));

        System.out.println("\nQuestion 2: findRepeats");
        System.out.print("Enter a string to test: ");
        String toTest = scanner.nextLine();

        System.out.println("findRepeats: " + findRepeats(toTest));

        scanner.close();
    }

    // Question 1: endOther
    //Write a method named endOther that takes two strings a and b as arguments and returns a boolean.
    //Given the two strings, return true if either of the strings appears at the very end of the other string,
    //ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    //Note: "String".toLowerCase() returns the lowercase version of a string.
    public static boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }

    // Question 2: findRepeats
    //Write a method named findRepeats that takes one string argument `toTest` and returns a boolean.
    //If any of the substrings with length greater than or equal to 2 within `toTest` appear multiple times, findRepeats will return true, else returning false.
    // y "substrings within", I mean any possible substring within the given string. So for "abc", all of it's substrings are "a", "b", "c", "ab", and "bc".
    //Only "ab" and "bc" have a length greater than or equal to 2, so you would only have to search for them.

    public static boolean findRepeats(String toTest) {
        for (int i = 0; i < toTest.length() - 1; i++) {
            for (int j = i + 2; j <= toTest.length(); j++) {
                String substr = toTest.substring(i, j);
                if (toTest.indexOf(substr, i + 1) != -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
