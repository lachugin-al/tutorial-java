package lessons.java101.arrays;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();

        // создаем массив игроков через конструктор
        Player[] players = new Player[] {new Player("Player1", new Figure("X")),
                                        new Player("Player2", new Figure("Y"))};

        //возможно задать и инициализировать вот такой пример массива
        int[][] arrayInt = new int[][] {
                {1, 2, 3},
                {1, 2},
                {1, 2, 3, 4}
        };

        board.showBoard();

        board.initArray();
        board.showBoard();

        board.init2dArray();
        board.setFigures2d(0, 0, "C");
        board.getFigures2d();
    }

}
