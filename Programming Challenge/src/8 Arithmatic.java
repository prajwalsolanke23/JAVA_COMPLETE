import java.util.Scanner;

class Arithmatic {

    public static void main(String[] args) {

        System.out.println("Welcome to arithmetic calculator\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter First Number: ");
        int first = sc.nextInt();

        System.out.println("Now, please enter second Number: ");
        int second = sc.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Division is: " + div);
        System.out.println("Modulus is: " + mod);


    }
}
