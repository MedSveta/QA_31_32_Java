package webinar3;

public class StringBuilderTasks {
    public static void main(String[] args) {
        System.out.println(repeatWord("Vasya ", 3));
        System.out.println(removeDigits("Vasya123Vasilev8"));
        System.out.println(removeSymbol("MolokoO", 'o'));
        System.out.println(replaceSymbol("MolokoO",
                'o', 'a'));
    }
    // Используя StringBuilder, замените все символы из строки на replacement.
    public static String replaceSymbol(String input, char symbol,
                                       char replaceSymbol){
        if (input == null || input.isBlank())
            return null;
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == symbol){
                sb.setCharAt(i, replaceSymbol);
            }
        }
        return sb.toString();
    }


    //Собрать строку, повторив слово n раз, используя StringBuilder
    public static String repeatWord(String word, int times) {
        if (word == null || word.isBlank() || times <= 0)
            return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(word);
        }
        return sb.toString();
    }

    //удалить все цифры из строки
    public static String removeDigits(String input) {
        if (input == null || input.isBlank())
            return null;
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    // Используя StringBuilder, удалите все символы 'o' из строки.
    public static String removeSymbol(String input, char symbol){
        if (input == null || input.isBlank())
            return null;
        StringBuilder res = new StringBuilder();
        for (char ch: input.toCharArray()){
            if (ch != symbol)
                res.append(ch);
        }
        return res.toString();
    }
}
