import java.util.Scanner;

class LeftShift {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("Welcome to Leftshift Operator.");

         System.out.println("Please enter your number: ");
         int num = sc.nextInt();

         int result = num << 4;
         System.out.println("Your result is: "+ result);

     }
}
