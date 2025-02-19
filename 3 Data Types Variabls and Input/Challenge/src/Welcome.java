import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {

        System.out.println("Please enter you name: ");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Welcome " + name + " to KG Coding");


    }
}
