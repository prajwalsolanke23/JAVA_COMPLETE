import java.util.Scanner;

class BitwiseComplementOrNot {

     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("Welcome to showcase of Not/Compliment Operator\n");

         System.out.println("Please enter your number: ");
         int num = sc.nextInt();

         int result = ~num;
         System.out.println("Your result is: " + result);

     }
}
