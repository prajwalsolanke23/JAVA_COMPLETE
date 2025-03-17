import java.util.Scanner;

class Lcm {

     public static void main(String[] args) {

         System.out.println("Welcome to LCM.");

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number: " );
         int first = sc.nextInt();

         System.out.println("Enter a number: ");
         int sec = sc.nextInt();

         int lcm = lcm(first, sec);
         System.out.println("LCM of the two numbers is: " + lcm );

     }

     public static int lcm(int first, int second) {

         int i = 1;

         while(true) { //i <= second) {

             int factor = first * i ;

             if(factor % second == 0) {
                 return factor;
             }

             i++;
         }
//         return 0; // unreachable
     }
}
