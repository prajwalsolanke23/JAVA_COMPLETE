import java.util.Scanner;

public class Return {

    public static void main(String[] args) {

        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of the number is: " + sum);

    }

//    public static int sumOfTwo() {
//        return
//    }

    public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }
}
