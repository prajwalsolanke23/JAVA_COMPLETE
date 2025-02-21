import java.util.Scanner;

class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Leap Year Finder");

        System.out.println("Enter an year: ");
        int year = sc.nextInt();

        if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Your Year is Leap Year.");
        } else {
            System.out.println("Your year is not a leap year.");
        }
    }
}
