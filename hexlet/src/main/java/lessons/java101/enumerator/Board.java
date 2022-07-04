package lessons.java101.enumerator;

import java.util.Arrays;

public class Board {

    private final Figure[][] figures = new Figure[3][3];

    // сетим фигуру по значению x, y
    public void setFigure(final int x, final int y, final Figure figure) {
        this.figures[x][y] = figure;
    }

    public Figure getFigure(final int x, final int y) {
        return figures[x][y];
    }

    // выводим массив на консоль
    public void showBoard() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                System.out.printf(" %s", figures[i][i2]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(figures));
    }

    public static void main(String[] args) {
        final Board board = new Board();    // создаем объект класса Board

        // сетим фигуры через конструктор и используем энумератор класса Figure
        board.setFigure(0, 0, Figure.X1); //X
        board.setFigure(0, 1, Figure.X2); //X
        board.setFigure(0, 2, Figure.X2); //X
        board.setFigure(1, 0, Figure.O1);
        board.setFigure(1, 1, Figure.O2);

        // сравним значения полей
        System.out.println(board.getFigure(0, 0) == board.getFigure(0, 1));
        System.out.println(board.getFigure(0, 1) == board.getFigure(0, 2));

        // выводим доску с фигурами на экран
        board.showBoard();

        // выводим в консоль все возможные значения инстансов энумератора
        for (Figure figure : Figure.values()) {
            System.out.println(figure);
        }

        // метод принимает стрингу и находит метод Figure который совпадает с этой стрингой
        // и передает в него значение данного энумератора
        Figure f = Figure.valueOf("X2");

    }

}
