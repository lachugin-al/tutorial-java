package practice.java101.xo;

import org.junit.jupiter.api.Test;
import practice.java101.xo.model.Field;
import practice.java101.xo.model.Figure;
import practice.java101.xo.model.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void getPlayers() throws Exception {
        final Player[] players = {new Player("a", Figure.X)};
        final Game game = new Game(players, null, null);
        assertNotNull(game.getPlayers());
    }

    @Test
    void getField() throws Exception {
        final Field field = new Field();
        final Game game = new Game(null, field, null);
        assertNotNull(game.getField());
    }

    @Test
    void getGameName() throws Exception {
        final Game game = new Game(null, null, "XO");
        assertEquals("XO", game.getGameName());
    }
}