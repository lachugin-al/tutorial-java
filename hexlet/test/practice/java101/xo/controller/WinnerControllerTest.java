package practice.java101.xo.controller;

import org.junit.jupiter.api.Test;
import practice.java101.xo.model.Field;
import practice.java101.xo.model.Figure;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class WinnerControllerTest {

    @Test
    void getWinnerRow() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field();
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i , 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(field.getFigure(new Point(i, 0)), winnerController.getWinner(field));
        }
    }

    @Test
    void getWinnerRow2() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field();
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1 , i), Figure.X);
            field.setFigure(new Point(2, i), Figure.X);
            assertEquals(field.getFigure(new Point(0, i)), winnerController.getWinner(field));
        }
    }

    @Test
    void getWinnerRow3() throws Exception {
        final WinnerController winnerController = new WinnerController();
        final Field field = new Field();
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(1 , 1), Figure.X);
        field.setFigure(new Point(2, 2), Figure.X);
        assertNotNull(winnerController.getWinner(field));
        assertEquals(field.getFigure(new Point(1, 1)), winnerController.getWinner(field));
    }

    @Test
    void getWinnerRow4() throws Exception {
        final WinnerController winnerController = new WinnerController();
        final Field field = new Field();
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1 , 1), Figure.X);
        field.setFigure(new Point(2, 0), Figure.X);
        assertNotNull(winnerController.getWinner(field));
        assertEquals(field.getFigure(new Point(1, 1)), winnerController.getWinner(field));
    }

    @Test
    void getNotWinnerRow() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field();
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i , 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);
            assertNull(winnerController.getWinner(field));
        }
    }

}