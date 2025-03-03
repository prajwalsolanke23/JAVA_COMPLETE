public class Function {

    public static void main(String[] args) {
//        System.out.println("In main method");
//        greeting();
//        System.out.println("Method calling complete");
//        greeting();

        printFirstPattern();
//        printSecondPattern();
//        printThirdPattern();

    }

    public static void printFirstPattern() {
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *\n");

        int i =0;
        while(i < 20) {
            System.out.print("*");
            int j = 0;
            while(j < i) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }



    public static void printSecondPattern() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*\n");
    }

    public static void printThirdPattern() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *\n");
    }

    public static void greeting() {
        System.out.println("Good Morning from KGCoding");
    }


}
