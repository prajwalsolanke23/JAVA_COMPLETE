import java.util.Scanner;

class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("Welcome to Fibonacci Series.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number up to which series has to be print: ");
        int num = sc.nextInt();

        System.out.println("Here is the Fibonacci Series");

        printFibonacci(num);
    }

    public static void printFibonacci(int num) {

        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }


    }


}
