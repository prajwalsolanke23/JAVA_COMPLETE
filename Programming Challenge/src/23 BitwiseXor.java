import java.util.Scanner;

class BitwiseXor {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Showcasing Bitwise Xor Operator\n");

        System.out.println("please enter the first number: ");
        int first = sc.nextInt();

        System.out.println("Now, enter the other number: ");
        int second = sc.nextInt();

        int result = first ^ second;
        System.out.println("Result is: " + result);

    }
}
