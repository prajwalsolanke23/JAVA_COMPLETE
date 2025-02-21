import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class GreatestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the World of Three.");

        System.out.println("Please enter your first number: ");
        int first = sc.nextInt();

        System.out.println("Please enter your second number: ");
        int second = sc.nextInt();

        System.out.println("Please enter your third number: ");
        int third = sc.nextInt();

        if (first >= second && first >= third) {
            System.out.println("Your greatest number is: " + first);
        } else if(second >= first && second >= third) {
            System.out.println("Your greatest number is: " + second);
        } else if(third >= first && third >= second) {
            System.out.println("Your greatest number is: " + third);
        }
    }
}
