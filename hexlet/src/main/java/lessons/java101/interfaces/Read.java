package lessons.java101.interfaces;

public class Read implements IReader {

    final String str;

    public Read(String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str;
    }
}
