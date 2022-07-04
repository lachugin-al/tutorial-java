package lessons.java101.levels;

public class Level {

    public static int a = 1;
    public int b = 2;

    public static void main(String[] args) {
        final Level level1 = new Level();
        final Level level2 = new Level();

        final Level2 level21 = new Level2();
        level21.aaa = "aaa";

        level1.a = -1;  // в переменную класса (класс левел), инстанс не вызывается, равносильно a = -1
        level1.b = -2;  // в переменную инстанса
        System.out.printf("a: %d, b: %d\n", level2.a, level2.b);

        /*
        объект класса Level будет брать только одну переменную a - статическую
        не имеет значение где мы ее поменяем
        она будет одна на все объекты
         */

        /*
        переменная b будет для каждого инстанса своя
         */

        Level.a = 1;    // обращаемся к переменной через класс без вызова инстанса
        level2.b = -2;
        System.out.printf("a: %d, b: %d", Level.a, level2.b);

    }

}
