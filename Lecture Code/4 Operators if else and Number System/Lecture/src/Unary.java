public class Unary {

    public static void main(String[] args) {

        int x = 5;
        int y = -x;
        int z = -y;

        System.out.println(x); // 5
        System.out.println(y); // -5
        System.out.println(z); // 5

        int a = 10;
        a = a + 1;
        System.out.println(a); // 11

        a += 1;
        System.out.println(a); // 12

        a++;
        System.out.println(a); // 13

        ++a;
        System.out.println(a); // 14

        // watching increment
        int p = 3;
        System.out.println(p++); // 3
        System.out.println(p); // 4

        System.out.println(++p); // 5
        System.out.println(p); // 5

    }
}
