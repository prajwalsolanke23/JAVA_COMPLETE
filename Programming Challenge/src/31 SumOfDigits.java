import java.util.Scanner;

class SumOfDigits {

    public static void main(String[] args) {

        System.out.println("Welcome to sum of digits");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you number: ");
        int num = sc.nextInt();

        int sum = sumOfDigits(num);

        System.out.println("Sum of digits is: " + sum);
    }

    public static int sumOfDigits(int num) {

        int sum = 0 ;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
