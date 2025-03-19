import java.sql.SQLOutput;
import java.util.Scanner;

class Gcd {

    public static void main(String[] args) {

        System.out.println("Welcome to GCD - greatest common divisor");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = sc.nextInt();

        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        int gcd = gcd(first, second);

        System.out.println("GCD of the numbers is: " + gcd);

    }

    public static int gcd(int num1, int num2) {

        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);

        while( i <= least) {

            if ( (num1 % i == 0 && num2 % i == 0)) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {

        if(num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
