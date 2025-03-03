import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Welcome to Multiplication Calculator.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        printMultiplicationTable(num);

    }

    public static void printMultiplicationTable(int num) {

        int i = 1;

        while( i <= 10) {

            System.out.println(num + " x " + i + " = " + (num*i));

            i++;
        }
    }
}
