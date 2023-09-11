public class compare {
    public static void main(String[] args) {
        decCompare();
        intCompare();
        strCompare();
        charCompare();

    }
    public static void intCompare() {
        // Integer Comparison
        int a = 1;
        int b = 2;

        // Output
        System.out.println("##################### Integer #####################");
        System.out.println("a == b is: " + (a == b));
        System.out.println("a != b is: " + (a != b));
        System.out.println("a > b is: " + (a > b));
        System.out.println("a < b is: " + (a < b));
        System.out.println("a >= b is: " + (a >= b));
        System.out.println("a <= b is: " + (a <= b));

    }

    public static void decCompare() {
        //Decimal Comparison
        double a = 10.2;
        float b = 22.25f;

        //Output
        System.out.println("##################### Decimal #####################");
        System.out.println("a == b is: " + (a == b));
        System.out.println("a != b is: " + (a != b));
        System.out.println("a > b is: " + (a > b));
        System.out.println("a < b is: " + (a < b));
        System.out.println("a >= b is: " + (a >= b));
        System.out.println("a <= b is: " + (a <= b));
    }

    public static void strCompare() {
        //String compare
        String a = "Hello";
        String b = "hello";

        //Output
        System.out.println("##################### String #####################");
        System.out.println("a == b is: " + (a == b));
        System.out.println("a != b is: " + (a != b));
    }

    public static void charCompare() {
        //Character compare
        char name1 = 'A';
        char name2 = 'a';
        
        //Output
        System.out.println("##################### Character #####################");
        System.out.println("name1 == name2 is: " + (name1 == name2));
        System.out.println("name1 != name2 is: " + (name1 != name2));
    }


}