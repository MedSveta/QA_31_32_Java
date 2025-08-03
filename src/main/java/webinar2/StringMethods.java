package webinar2;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cool";
        int l = str.length();
        System.out.println(l);
        char zeroChar = str.charAt(0);
        System.out.println(zeroChar);
        String abd = " ArweA ";
        String abdWOSpace = abd.trim();
        String abdRep = abd.replace('A',
                'a');
        System.out.println(abdWOSpace);
        System.out.println(abdRep);
        String abdRepAll = abd.replaceAll
                ("weA", "reT");
        System.out.println(abdRepAll);
        String res = str.concat(", ").concat(abd);
        System.out.println(res);
        String subStr = str.substring(1, 3);
        System.out.println(subStr);
        //==============================

        String text = " Today is a Good Day! ";
        System.out.println(countWords(text));
        System.out.println(countChar("MonkeyMonkey", 'k'));
        //============================================
        String sentence1 = "I have two Cats," +
                " a grey cat and a white Cat";
        System.out.println(replaceWord(sentence1));
        System.out.println(findLongestWord(text));
        //================================
        String text1 = "";
        System.out.println(replaceDigits("try361nu0Aew7"
                , "AaA"));
    }
    //    Задача 1: Подсчитать количество слов в строке
//    Условие: Напиши метод, который получает строку и
//    возвращает количество слов в ней.
//    Слова разделены пробелами.

    public static Integer countWords(String text) {
        if (text.isBlank())
            return null;
        String[] words = text.trim().split(" ");
        return words.length;
    }

    //Напиши метод, который считает,
    // сколько раз определённый символ встречается в строке.

    public static int countChar(String str, char target) {
        if (str.isBlank())
            return -1;
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target)
                count++;
        }
        return count;
    }
    //Заменить все вхождения слова "cat" на "dog" в строке.

    public static String replaceWord(String sentence){
        if (sentence.isBlank())
            return null;
//        String res = sentence
//                .replaceAll("cat", "dog");
//        return res;
        return sentence.toLowerCase().replaceAll("cat", "dog");
    }


    //Найти самое длинное слово
    //Из строки найти слово с наибольшей длиной.

    public static String findLongestWord(String sentence){
        if (sentence.isBlank())
            return null;
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word: words){
            if (word.length()>longestWord.length())
                longestWord = word;
        }
        return longestWord;
    }

    //Напиши метод,
    // который заменяет все цифры из строки на replaceStr

    public static String replaceDigits(String text, String repStr){
        if (text.isBlank())
            return null;
        text = text.trim();
        for (int i = 0; i < text.length(); i++) {
           char ch = text.charAt(i);
           if (isDigit(ch))
               text = text.replace(Character.toString(ch), repStr);
        }
        return text;
    }


    private static boolean isDigit(char ch){
        String digits = "0123456789";
        if(digits.contains(Character.toString(ch)))
            return true;
        return false;
    }
}
