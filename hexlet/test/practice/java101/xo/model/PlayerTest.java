package practice.java101.xo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() throws Exception {
        final String inputValue = "inputValue";
        final String expectedValue = inputValue;
        final Player player = new Player(inputValue, null);
        final String getValue = player.getName();

        assertNotNull(getValue);
        assertEquals(expectedValue, getValue);
    }

    @Test
    void getFigure() throws Exception {
        final Figure inputFigureValue = Figure.X;
        final Figure expectedFigureValue = inputFigureValue;
        final Player player = new Player(null, inputFigureValue);
        final Figure getFigureValue = player.getFigure();

        assertNotNull(getFigureValue);
        assertEquals(expectedFigureValue, getFigureValue);
    }

    @Test
    void nullPlayerConstructor() throws Exception {
        final Player player = new Player("a", Figure.X);
        assertNotNull(player.getName());
        assertNotNull(player.getFigure());
    }
}