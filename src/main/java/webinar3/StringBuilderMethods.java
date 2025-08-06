package webinar3;

public class StringBuilderMethods {
    public static void main(String[] args) {
       StringBuilder strBild = new StringBuilder();
       StringBuilder strBild1 = new StringBuilder("good day ");
       StringBuilder strBild2 = new StringBuilder(50);

       String str = strBild1.toString();
        System.out.println(strBild1);
        System.out.println(strBild1.length());
        System.out.println(strBild1.capacity());

        strBild1.append(true).append(" ").append(123).append(56.9);
        System.out.println(strBild1);
        strBild1.insert(9, "Mama");
        System.out.println(strBild1);

        System.out.println(strBild1.indexOf("true"));
        System.out.println(strBild1.lastIndexOf("true"));
        System.out.println(strBild1.lastIndexOf("true", 15));

        System.out.println(strBild1.substring(3, 7));
        System.out.println(strBild1.substring(7));

        strBild1.setCharAt(3, 'F');
        System.out.println(strBild1);
        System.out.println("after delete "+ strBild1.deleteCharAt(3));
        System.out.println("after delete "+ strBild1.delete(12, 16));
        System.out.println("after reverse "+ strBild1.reverse());
        String str1 = strBild1.toString();


    }
}
