package practice.java101.xo;

import practice.java101.xo.controller.CurrentMoveController;
import practice.java101.xo.controller.MoveController;
import practice.java101.xo.controller.WinnerController;
import practice.java101.xo.exceptions.InvalidPointException;
import practice.java101.xo.exceptions.PointAllreadySetException;
import practice.java101.xo.model.Field;
import practice.java101.xo.model.Figure;
import practice.java101.xo.model.Player;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class Game implements Iterable<Player> {

    private final Player[] players;
    private final Field field;
    private final String gameName;
    private final CurrentMoveController currentMoveController = new CurrentMoveController();
    private final WinnerController winnerController = new WinnerController();
    private final MoveController moveController = new MoveController();

    public Game(final Player[] players, final Field field, final String gameName) {
        this.players = players;
        this.field = field;
        this.gameName = gameName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Field getField() {
        return field;
    }

    public String getGameName() {
        return gameName;
    }

    public void show(final Game game) {
        System.out.printf("Game name: %s\n", gameName);

        for (Player player : players) {
            System.out.format("%s play figure %s\n", player.getName(), player.getFigure());
        }

        /* or
        final Iterator<Player> playerIterator = game.iterator();
        while (playerIterator.hasNext()) {
            final Player player = playerIterator.next();
            System.out.format("Player: %s playes figure $s", player.getName(), player.getFigure());
        }
        */

        for (int x = 0; x < Field.getFieldSizeMax(); x++) {
            if (x != 0) {
                printSeparator();
            }
            printLine(field, x);
        }
    }

    private void printLine(Field field, int x) {
        for (int y = 0; y < Field.getFieldSizeMax(); y++) {
            if (y != 0) {
                System.out.print("|");
            }
            System.out.print(" ");
            final Figure figure;
            try {
                figure = field.getFigure(new Point(y, x));
            } catch (InvalidPointException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            // если figure != null то вернется figure иначе вернется " "
            System.out.print(figure != null ? figure : " ");
        }
        System.out.println();
    }

    private void printSeparator() {
        System.out.println("--------");
    }

    // подставляем запрашиваемые координаты в Point (-1 так как считаем с 0)
    private Point askPoint() {
        return (new Point(askCoordinateXorY("x") - 1, askCoordinateXorY("y") - 1));
    }

    // запрашиваем координату в консоль
    public int askCoordinateXorY(final String coordinate) {
        System.out.printf("Please input %s: ", coordinate);
        Scanner scanner = new Scanner(System.in);
        // если вводят не числовую координату то через try/catch заново просим ввести
        try {
            return scanner.nextInt();
        } catch (final InputMismatchException e) {
            System.out.printf("One more time: ");
            return askCoordinateXorY(coordinate);
        }

    }

    public boolean isMove(final Game game) {
        // если в текущем ходу есть победитель то выводим победителя
        final Figure winner = winnerController.getWinner(getField());
        if (winner != null) {
            System.out.printf("Winner: %s", winner);
            return false;
        }
        // если выше на ходу нет победителя то проверяем следующий ход
        final Figure currentFigure = currentMoveController.currentMove(getField());
        if (currentFigure == null) {
            System.out.println("No winner and no move left");
            return false;
        }
        System.out.printf("Please enter move Point for: %s\n", currentFigure);
        final Point point = askPoint();
        moveController.applyFigure(point, field, currentFigure);
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input player 1 name: ");
        final String playerName1 = scanner.next();
        System.out.print("Please input player 2 name: ");
        final String playerName2 = scanner.next();

        final Player[] players = new Player[2];
        players[0] = new Player(playerName1, Figure.X);
        players[1] = new Player(playerName2, Figure.O);
        final Game game = new Game(players, new Field(), "XO");
        game.show(game);
        while (game.isMove(game)) {
            game.show(game);
        }
    }

    @Override
    public Iterator<Player> iterator() {
        final List<Player> playerList = Arrays.asList(players);
        return playerList.iterator();
    }

    private class PlayerIterator implements Iterator<Player> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return Game.this.players.length > index; // проверяем что текущий индекс меньше чем длинна массива, значит есть следующий обьект для итерации
        }

        @Override
        public Player next() {
            /*final int currentIndex = index;
            index += 1;
            return Game.this.players[currentIndex];*/
            return Game.this.players[index++]; // возвращаем следующий ссылку на следуюзщий элемент по индексу
        }
    }
}
