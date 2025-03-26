import java.util.Scanner;

class ArmstrongNumber {

     public static void main(String[] args) {

         System.out.println("Welcome to Armstrong number checker");

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number to check: ");
         int num = sc.nextInt();

         boolean isArmstrong = isArmstrong(num);

         if(isArmstrong) {
             System.out.println("Your number is Armstrong");
         } else {
             System.out.println("Your number is not Armstrong");
         }

     }

     public static boolean isArmstrong(int num) {
         int noOfDigits = noOfDigits(num);
         int numCopy = num;
         int finalNumber = 0;
         while(num>0){
             int lastDigit = num % 10;
             num = num/10;
             finalNumber = finalNumber + pow(lastDigit, noOfDigits);
         }
         return finalNumber == numCopy;
     }

     public static int pow(int num1, int num2) {
         int result = 1;
         int i = 0;
         while(i<num2){
             result = result * num1;
             i++;
         }
         return result;
     }

     public static int noOfDigits(int num) {
         int digits = 0;
         while(num>0) {
             digits++;
             num = num/10;
         }
         return digits;
     }


}

