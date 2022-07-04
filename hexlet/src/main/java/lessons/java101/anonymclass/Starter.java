package lessons.java101.anonymclass;

// Нельзя создать анонимный класс без ссылки на этот класс

public class Starter {

    public static void main(String[] args) {
        // final IPrinter textPrint = new Print();
        /**
         * Если после new Print() указать фигурные скобки {} то это будет означать, что:
         * мы создаем новый класс (не инстанс), который экстендится от Printer
         * и в фигурных скобках можем переопределять методы данного класса
         */

        /**
         * Напечатается
         * Hello:)
         * ******
         * так как мы создаем ссылку на новый класс в котором переопределеяем метод print
         */
        final IPrinter textPrint = new Print()
        {
            @Override
            public void print(String text) {
                super.print("Hello:)");
                System.out.println("******");
            }
        }
        ;
        // отрабатываться не будет так как не создан инстанс new Print();
        textPrint.print("HelloHello:)");
    }
}
