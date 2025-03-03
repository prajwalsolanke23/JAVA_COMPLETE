public class Parameter {

    public static void main(String[] args) {
        int num = sumOfTwoNumbers(4, 7);
        System.out.println("the sum is: "+num);

        System.out.println("The sum is: " + sumOfTwoNumbers(4, 4));
    }

    public static int sumOfTwoNumbers(int first, int second) {
        System.out.println("first no: "+first);
        System.out.println("second no: "+second);
        return first + second;
    }
}
