package webinar4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTasks {
    public static void main(String[] args) {
        // . \\. $ ^ [^] \d \D [a-g]{2}  \s+ \w \W

        String exp = "a!bb";
        String reg = "a.b";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(exp);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
        System.out.println(matcher.replaceFirst("Ira"));
        System.out.println(matcher.replaceAll("Katya"));
        System.out.println(isLettersA_F_AndSpace("abcd FD D "));
        System.out.println(isLettersA_F_AndSpace("abcdZ FD D "));
        System.out.println(isLettersA_F_AndSpace("abcd3 FD D "));
        System.out.println(isLettersA_F_AndSpace("abcds FD D "));
        System.out.println(isNotDigits("adr$ DR"));
        System.out.println(isNotDigits("adr$ 1DR"));
        System.out.println(isEnglishName("Vasya"));
        System.out.println(isEnglishName("Vasya1"));
        System.out.println(isEnglishName("Vasya Vasya"));
        System.out.println(isEnglishName("V"));
        System.out.println(isEnglishName("Vasyaaaaaaaaaaaaaaaaa"));
        System.out.println(isEnglishFullName("Vasya Vasilev"));
        System.out.println(isEnglishFullName("vasya Vasilev"));
        System.out.println(isEnglishFullName("Vasya vasilev"));
        System.out.println(isEnglishFullName("Vasya  Vasilev"));
        System.out.println(replaceSpace("To be or n o t to be"));
        System.out.println(isEmail("myemail@gmail.com"));
        System.out.println(isEmail("my123email@gmail.com"));
        System.out.println(isEmail("my123-email@gmail.com"));
        System.out.println(isEmail("my123-email@gmail..com"));
        System.out.println(isEmail("my.123-email@gmail.com"));
        System.out.println(isEmail("my.123.email@gmail.com"));
        System.out.println(isEmail("my.123.email@@gmail.com"));
        System.out.println(isEmail("my.123@email@gmail.com"));
        System.out.println(isEmail("my.123email@gmail.Com"));
        System.out.println(isEmail("my.123email@gmail.1om"));

    }

  //Task 1   a-f  A-F  and space
    static Boolean isLettersA_F_AndSpace(String str){
        if (str.isBlank())
            return null;
        Pattern pattern = Pattern.compile("[a-fA-F\\s]+");// "[a-z]+"
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    static Boolean isEmail(String str){
        if (str.isBlank())
            return null;  //myemail@gmail.com
        Pattern pattern = Pattern.compile("^[\\w.-]+@\\w+\\.[a-z]{3}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static Boolean isNotDigits(String str){
        if (str.isBlank())
            return null;
        Pattern pattern = Pattern.compile("[^0-9]+"); // \\D+ \\d+ [0-9]+
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static Boolean isEnglishName(String str){
        if (str.isBlank())
            return null;     //Vasya
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{1,19}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static Boolean isEnglishFullName(String str){
        if (str.isBlank())
            return null;     //Vasya Vasilev
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{1,9}\\s[A-Z]{1}[a-z]{1,9}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    static String replaceSpace(String str){
        if (str.isBlank())
            return null;
        String output = str.replaceAll("\\s+", "_");
        return output;
    }

}
