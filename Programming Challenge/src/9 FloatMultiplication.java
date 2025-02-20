import java.util.Scanner;

class FloatMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("We are doing float multiplication.");

        System.out.println("Please enter first decimal number: ");
        double first = sc.nextDouble();

        System.out.println("Now, please enter second number: ");
        double second = sc.nextDouble();

//        double mul = first * second;

        System.out.println("\nResult is: " + (first * second) );



    }
}
