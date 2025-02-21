import java.util.Scanner;

class Grading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Grading Calculator");

        System.out.println("Please enter your percentage: ");
        float percentage = sc.nextFloat();

        if (percentage >= 90) {
            System.out.println("You have got A");
        } else if (percentage >= 75) {
            System.out.println("You have got B");
        } else if (percentage >= 60) {
            System.out.println("Your have got C");
        } else if (percentage >= 30) {
            System.out.println("You have got D");
        } else {
            System.out.println("You have failed the test.");
        }


    }
}
