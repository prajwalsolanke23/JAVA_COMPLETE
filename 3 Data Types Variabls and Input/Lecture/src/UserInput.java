import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // User Input

        Scanner sc = new Scanner(System.in); // obj declaration

        System.out.println("Please enter your name: ");

        String name = sc.nextLine();

        System.out.println("Good Morning " + name);

        System.out.println(name + ", Also tell me your age: ");

        int age = sc.nextInt();

        System.out.println("Your age is: " + age);

    }
}
