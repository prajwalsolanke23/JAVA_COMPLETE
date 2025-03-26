import java.util.Scanner;

class ReverseTheDigit {

    public static void main(String[] args) {

        System.out.println("Welcome to Reverse the digit program.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reverse = reverse(num);

        System.out.println("Reverse of your number is: " + reverse);

    }

    public static int reverse(int num) {

        int rev = 0;

        while(num > 0) {
            int digit = num % 10 ;
            rev = rev * 10 + digit;
            num = num/10;
        }

        return rev;
    }
}
