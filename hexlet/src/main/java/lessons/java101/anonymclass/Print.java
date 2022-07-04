package lessons.java101.anonymclass;

public class Print implements IPrinter {

    // метод оверрайдит интерфейсовский метод
    @Override
    public void print(final String text) {
        System.out.println(text);
    }
}
