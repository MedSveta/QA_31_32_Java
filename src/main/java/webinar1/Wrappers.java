package webinar1;

public class Wrappers {
    public static void main(String[] args) {
      /*
	 byte => Byte
	 short => Short
	 int => Integer
	 long => Long
	 boolean => Boolean
	 char => Character
	 float => Float
	 double => Double
	 */

        int a = 12;
        Integer b = 45;
        String sb = b.toString();
        System.out.println(sb + a);
        int c = Integer.parseInt("345");
        System.out.println(c + a);
        //c = Integer.parseInt("345a34"); => Exception
        System.out.println(c + a);

        String f = "345.56";
        float f1 = Float.parseFloat(f);
        System.out.println(f1*10);

        boolean bol = Boolean.parseBoolean("TruE");
        System.out.println(bol);

        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isDigit('w'));
        System.out.println(Character.isDigit(65));
        System.out.println(Character.isLowerCase('w'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLetterOrDigit('@'));

        Integer i1 = Integer.max(3, 6);
        System.out.println(i1);
        Integer i2 = Integer.min(1, 7);
        System.out.println(i2);

        int i3 = i2; //распаковка до примитива
        Integer i4 = i3;

        String[] str = new String[]{};
        String[] str1 = {"str1", "str2", "str3", null};
        String[] str2 = new String[3];
        str2[0] = "tyui";
    }
}
