import java.util.Scanner;

class Swap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to swapping station");

        System.out.println("Enter value of A: ");

        int a = sc.nextInt();

        System.out.println("Enter value of B: ");

        int b = sc.nextInt();

        // swapping

        int c = a;
        a = b;
        b = c;

        System.out.println("Swapping done...");
        System.out.println("Value of A is : " + a);
        System.out.println("Value of B is : " + b);

    }
}
