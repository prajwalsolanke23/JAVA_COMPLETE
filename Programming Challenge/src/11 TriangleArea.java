import java.util.Scanner;

class TriangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Area calculator\n");

        System.out.println("Please enter your base in cm : ");
        double base = sc.nextDouble();

        System.out.println("Now, enter your perpendicular height in cm : ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of your triangle is: " + area + " cm");
    }
}
