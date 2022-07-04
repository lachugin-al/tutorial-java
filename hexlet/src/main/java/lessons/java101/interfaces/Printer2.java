package lessons.java101.interfaces;

public class Printer2 implements IPrinter {

    @Override
    public void print(String text) {
        System.out.println(text + " " + text.length());
    }
}
