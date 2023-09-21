package cs1302.example;

import cs1302.utility.MyMethods;

/**
 *{@code Hello} gets two integers from the user and prints the larger of the two.
 */
public class Hello {
    //Determines the larger of two integers
    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.println("Enter 2 integers to determine the bigger one: ");

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int largerNumber = MyMethods.bigger(a, b);
        System.out.println("The larger of the two numbers is: " + largerNumber);

        keyboard.close();

    }

}
