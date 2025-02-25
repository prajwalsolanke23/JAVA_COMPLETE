import java.util.Scanner;

class OddEvenBitwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to odd even calculator");

        System.out.println("Please enter your number: ");
        int num = sc.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Your number is Odd");
        } else {
            System.out.println("Your number is Even");
        }



    }
}
