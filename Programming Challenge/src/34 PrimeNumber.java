import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Welcome to Prime Number");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = isPrime(num);

        if(isPrime)
            System.out.println("Your number is prime.");
        else
            System.out.println("Your number is not prime");

    }

    public static boolean isPrime(int num) {
        int i = 2;
        while( i < num) {
            if(num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
