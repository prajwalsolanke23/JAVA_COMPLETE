import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

//        int num = 1;
//        while (num <= 10) {
//            System.out.println(num);
//            num = num + 1;
//        }

        int count = 500;
        while (count >= 200) {

            System.out.println(count);
//            count = count - 1;
            count -= 1;
        }

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<5) {
            int a = sc.nextInt();
            System.out.println("Number is: "+a);
//            i = i + 1;
            i += 1;
        }

    }
}
