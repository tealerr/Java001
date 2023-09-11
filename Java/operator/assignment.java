public class assignment {
    public static void main(String[] args) {
        System.out.println("********  Assignment operators ********");
        PrimaryAssign();

        System.out.println("******** Other assignment operators ********");
        OtherAssign();
    }

    public static void PrimaryAssign(){
        int x;

        x = 10;
        System.out.println("x = "+ x);


        x += 3;
        System.out.println("x +=3 is "+ x);

        x = 10;
        x -= 3;
        System.out.println("x -=3 is "+ x);


        x = 10;
        x *= 3;
        System.out.println("x *=3 is "+ x);


        x = 10;
        x /= 3;
        System.out.println("x /=3 is "+ x);

    }

    public static void OtherAssign(){
        int x;

        x = 10;
        x &= 3;
        System.out.println("x &=3 is "+ x);

        x = 10;
        x |= 3;
        System.out.println("x |=3 is "+ x);

        x = 10;
        x ^= 3;
        System.out.println("x ^=3 is "+ x);

        x = 10;
        x >>= 3;
        System.out.println("x >>=3 is "+ x);

        x = 10;
        x <<= 3;
        System.out.println("x <<=3 is "+ x);

    }
}
