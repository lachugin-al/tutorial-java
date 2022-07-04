package lessons.java101.strings;

/*implements java.io.Serializable, Comparable<String>, CharSequence
java.io.Serializable - все кто объекты могут быть перезаписаны, переданы по сети и т.д.
Comparable<String> - объекты можно сравнивать между собой (во время сортировки тоже происходит сравнение)
CharSequence - работа с символами (charAt(int), length() и т.д.)
 */

public class StringCreate {

    final char[] nameArray = new char[]{'a','n','t'};
    final String name = new String(nameArray);

    // создаем массив через StringBuilder на 30 индексов
    private void printDate(final int day, final String month, final int year) {
        final StringBuilder messageBuilder = new StringBuilder(30);
        messageBuilder.append(day);
        messageBuilder.append(month);
        messageBuilder.append(year);
        System.out.println(messageBuilder);
    }

    // or

    private void printDateTwo(final int day, final String month, final int year) {
        System.out.println(new StringBuilder(30)
                .append(day)
                .append(month)
                .append(year)   // append возвращает StringBuilder
        );
    }



}
