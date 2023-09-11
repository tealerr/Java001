public class arithmetic {
    public static void main(String[] args) {
        NumberArithmetic();
        TextArithmetic();
    }

    public static void NumberArithmetic() {
        int sum = 5 + 3;
        double total = 10.5 + 2.5;
        System.out.println("sum value is: " + sum);
        System.out.println("total value is: " + total);

    }

    public static void TextArithmetic() {
        char b = 'a' + 1;

        //String
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        //Output
        System.out.println("b value is: " + b);
        System.out.println("fullName is: " + fullName);

    }
}
