package webinar1;

public class DataTypes {
    static int b;
    static double b1;
    static boolean b2;
    static char b3;


    public static void main(String[] args) {
        //примитивные
        //целочисленные byte; short; int; long -9,223,372,036,854,775,808.    .9,223,372,036,854,775,807;
        // с плавающей точкой double; float;
        // символьные char;
        // логические boolean;

        int a;
        //System.out.println(a);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        long l = 10_000_000_00000L;
        float f = 3.0986675432f;

        char char1 = 65;
        System.out.println(char1);
        char char2 = 'A';
        System.out.println(char2);
        System.out.println((int) char2);
        for (int i = 65; i < 80; i++) {
            char char3 = (char) i;
            System.out.print(char3 + " : ");
            System.out.println("//====================================");

            String string1 = "qwerty";
            String string2 = "qwerty";
            if (string1 == string2)
                System.out.println("strings value equal");
            else
                System.out.println("strings value not equal");
            String string3 = new String("Zrty");
            String string4 = new String("zrty");

            if (string3 == string4)
                System.out.println("strings value equal");
            else
                System.out.println("strings value not equal");

            if (string3.equals(string4) == true)
                System.out.println("strings value equal");
            else
                System.out.println("strings value not equal");

            if (string3.equalsIgnoreCase(string4) == true)
                System.out.println("strings value equal");
            else
                System.out.println("strings value not equal");


        }
    }

    private String first(){
        return null;
    }
}
