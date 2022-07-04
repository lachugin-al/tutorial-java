package lessons.java101.interfaces;

public interface IReader {

    public String read();

    // добавление тела метода в интерфейс в java 8
    default void load() {
    };

}
