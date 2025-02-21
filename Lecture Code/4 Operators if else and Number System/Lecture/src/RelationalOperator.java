import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Driving Portal");

        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Your are eligible to drive");
        }else {
            System.out.println("Beta Cycle Chalao");
        }
    }
}
