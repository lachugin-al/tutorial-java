import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
        NodeMutable

        final Random r = new Random();
        INode root = new NodeMutable(0); // устанавливаем значение первой Ноды = 0 (потом его перезапишем)
        for (int i = 0; i < 1_000; i++) {
            root = root.add(r.nextInt() % 500); // добавляем рандомные числа от 0 до 499
        }
        root.print();
        System.out.printf("Count: %d", root.count()); // подсчитываем кол-во элементов в дереве
        */

        /*
        NodeImmutable

        final Random r = new Random();
        INode root = new NodeImmutable(0, null, null); // устанавливаем значение первой Ноды = 0 (потом его перезапишем)
        for (int i = 0; i < 1_000; i++) {
            root = root.add(r.nextInt() % 500); // добавляем рандомные числа от 0 до 499
        }
        root.print();
        System.out.printf("Count: %d", root.count()); // подсчитываем кол-во элементов в дереве
         */

        /*
        Рефакторинг NodeImmutable
        Ключевая разница что в forEach я могу запустить что угодно, например вывести только четные значения
        дорабатывается в public void consume(Integer value)
         */
        final Random r = new Random();
        INode root = new NodeImmutable(0, null, null); // устанавливаем значение первой Ноды = 0 (потом его перезапишем)
        for (int i = 0; i < 1_000; i++) {
            root = root.add(r.nextInt() % 500); // добавляем рандомные числа от 0 до 499
        }
        root.forEach(new Printer());
        System.out.printf("Count: %d", root.count()); // подсчитываем кол-во элементов в дереве

    }

    private static class Printer implements INode.IConsumer<Integer> {

        @Override
        public void consume(Integer value) {
//            System.out.println(value);
            if (value %2 == 0) System.out.println(value);
        }
    }
}
