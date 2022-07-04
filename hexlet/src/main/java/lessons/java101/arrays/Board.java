package lessons.java101.arrays;

import java.util.Arrays;

public class Board {

//    private Figure[] figures; // null
    private final Figure[] figures = new Figure[9]; //[Llessons.java.arrays.Figure;@61bbe9ba
    private final Figure[][] figures2d = new Figure[3][3];

    public void showBoard() {
        System.out.println(this.figures);                   // отображает ссылку на массив
        System.out.println(Arrays.toString(this.figures));  // отображает значения массива
        // пройдет по всем элементам массива и у каждого вызовет toString (здесь у Figure)
        // по аналогии
        // System.out.println(this.figures[0].toString());
    }

    // инициализируем массив данными, после при вызове метода toString будут отображаться не null
    // а ссылки на объекты в массиве по индексам 0 и 1
    public void initArray() {
        figures[0] = new Figure("A"); // создаем объект через конструктор
        figures[1] = new Figure("B");
    }

    public void init2dArray() {
        figures2d[0][0] = new Figure("A"); // создаем объект через конструктор
        figures2d[0][1] = new Figure("B"); // создаем объект через конструктор
    }

    public void setFigures2d(int x, int y, String figure) {

        // на уровне компилятора включить -ea (enable assert)
        // BEGIN
        assert x > 0;
        assert y > 0;
        // END

        figures2d[x][y] = new Figure(figure);
    }

    public void getFigures2d() {
        System.out.println(Arrays.toString(figures2d));         // вызовет toString у подмассива
        System.out.println(this.figures2d[0][0].toString());
        System.out.println(Arrays.deepToString(figures2d));     // для могомерных массивов
    }


}
