import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our calculator");

        System.out.println("Please enter first number: ");

        int firstNumber = sc.nextInt();

        System.out.println("Please enter second number: ");

        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum of your number is " + sum);

    }
}
