import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Interest Calculator\n");

        System.out.println("Please enter your principle amount Rs");
        int principle = sc.nextInt();

        System.out.println("Now, Tell me your rate of interest: ");
        float rate = sc.nextFloat();

        System.out.println("Now, tell me for how many years are you borrowing the money: ");
        float years = sc.nextFloat();

        float interest = (principle * rate * years) / 100;

        System.out.println("\nYour Simple Interest is RS : " + interest);
    }
}
