package lessons.java101.arrays;

public class Figure {

    private final String figure;

    public Figure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    // toString класса Object ([lessons.java.arrays.Figure@610455d6, lessons.java.arrays.Figure@511d50c0, null, null, null, null, null, null, null])
    // @Override
    // public String toString() {
    //    return super.toString();  // выводит [lessons.java.arrays.Figure@610455d6 объекта
    // }

    // заменим на @Override method
    @Override
    public String toString() {
        return figure.toString();   // выводит объект в String
    }
}
