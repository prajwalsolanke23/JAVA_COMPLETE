import java.util.Scanner;

class OddSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Odd Sum: ");

        System.out.println("Please enter your number: ");

        int num = sc.nextInt();
        int sum = oddSum(num);

        System.out.println("OddSum till " + num + " is: " + sum);
    }

    public static int oddSum(int num) {

        int sum = 0;
        int i = 1;

        while(i <= num) {
//            sum = sum + i;
            sum += i;
            i += 2;
        }

        return sum;
    }
}
