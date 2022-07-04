package lessons.java101.strings;

public class Strings {

    public static void main(String[] args) {
        final String name = "Anton";
        System.out.println(name.charAt(1));

        final String date = "10/Sept/2020";
        System.out.println(date.substring(3, 7));   // по 7 не включительно
        System.out.println(date.substring(0, date.length()));
        System.out.println(date.substring(3));  // с 3

        final String system = "Windows 95";
        System.out.println(system.startsWith("Windows 9")); // true

        // строка всегда immutable, а вот результат методов можно получить разный
        final String target = " Windows win ";
        target.trim();  // убирает пробелы по 2м сторонам строки
        target.lastIndexOf('w');    // последний индек где встречался этот конкретный символ
        target.lastIndexOf('W');
        target.indexOf('w');            // первый индекс где встречается данный символ
        target.indexOf('w', 8); // с позиции с которой необходимо осуществлять поиск
        System.out.println(target.indexOf('w', 8));
        target.indexOf("win");      // с индекса с которой начинаетс данная подстрока win
        System.out.println(target.indexOf("win"));  // 9 index
        target.toLowerCase().trim().indexOf("win");
        System.out.println(target.toLowerCase().trim().indexOf("win")); // 0 index

    }
}
