import java.util.Scanner;

public class StringAssignment {
 /*  Write a Java program that assigns your name to a variable and prints the variable to the console.

Then, enhance your program by asking user's name and print out personalized prompt.*/
    public static void main(String [] args) {

        Scanner keyboard = new Scanner(System.in);


        String firstName, lastName; // declaring variables
        String name; // declaring variables

        //assigning values to the variables
        firstName = "Ruth ";
        lastName = "Tadese";

        Scanner scan = new Scanner (System.in); //to print personalized prompt or get user's response

        System.out.println("My name is " + firstName + lastName);
        System.out.println("What is your name?");
        name = scan.nextLine();










    }
}
