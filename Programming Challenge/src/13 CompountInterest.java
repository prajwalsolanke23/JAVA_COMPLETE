import java.util.Scanner;

class CompountInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Compound interest calculator");

        System.out.println("Please enter your principle amount Rs");
        int principle = sc.nextInt();

        System.out.println("Now, Tell me your rate of interest: ");
        float rate = sc.nextFloat();

        System.out.println("Now, tell me for how many years are you borrowing the money: ");
        float years = sc.nextFloat();

        double compInt = principle * Math.pow((1 + rate / 100), years);

        System.out.println("\nYour Compound Interest is RS : " + compInt);





    }
}
