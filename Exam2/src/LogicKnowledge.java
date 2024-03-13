import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question 3: greenTicket
        //Write a method named greenTicket that takes three integer arguments:
        //a, b and c and returns an integer. You have a green lottery ticket, with integers a, b, and c on it.
        //If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20.
        //If two of the numbers are the same, the result is 10.

        System.out.println("Question 3: greenTicket");
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        System.out.println("Result: " + greenTicket(a, b, c));

        // Question 4: makeChocolate
        //Write a method named makeChocolate that takes three integer arguments:
        //small, large and goal and returns an integer.
        //The small argument is the number of 1 pound chocolate bars we have,
        //large is the number of 5 pound chocolate bars we have, the goal is the total number of pounds we need to sell.
        //The method should return the number of small bars to use, assuming we use as many of the big bars as possible before the small bars.
        //Return -1 if it cannot be done.

        System.out.println("\nQuestion 4: makeChocolate");
        System.out.print("Enter the number of small bars: ");
        int small = scanner.nextInt();
        System.out.print("Enter the number of large bars: ");
        int large = scanner.nextInt();
        System.out.print("Enter the goal: ");
        int goal = scanner.nextInt();

        System.out.println("Result: " + makeChocolate(small, large, goal));

        scanner.close();
    }

    // Question 3: greenTicket
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    // Question 4: makeChocolate
    public static int makeChocolate(int small, int large, int goal) {
        int maxLarge = goal / 5;
        if (maxLarge >= large) {
            goal -= 5 * large;
        } else {
            goal -= 5 * maxLarge;
        }
        if (small >= goal) {
            return goal;
        } else {
            return -1;
        }
    }
}
