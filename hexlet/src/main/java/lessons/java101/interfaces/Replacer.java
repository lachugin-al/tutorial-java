package lessons.java101.interfaces;

// полиморфизм, когда есть один конракт и много инмплементаций данного контракта

public class Replacer {

    private final IPrinter printer;
    private final IReader reader;

    // через конструктор принимаем любую имплементацию, которая удовлетворяет интерфейсам IPrinter, IReader
    public Replacer(final IPrinter printer, final IReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public void replace() {
        final String text = reader.read();  // читаем из строки или любого друго места
        final String replaceText = text.replace(":(", ":)");    // заменяем и сохраняем в новую переменную
        printer.print(replaceText); // выводим в консоль
    }

    public static void main(String[] args) {
        final IReader reader = new Read("Hello:(");

        final IPrinter printer = new Print();
        final Replacer replacer = new Replacer(printer, reader);

        replacer.replace();

        final IPrinter printer2 = new Printer2();
        final Replacer replacer2 = new Replacer(printer2, reader);

        replacer2.replace();
    }

}
