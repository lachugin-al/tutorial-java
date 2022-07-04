package practice.java101.xo.controller;

import org.junit.jupiter.api.Test;
import practice.java101.xo.model.Field;
import practice.java101.xo.model.Figure;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CurrentMoveControllerTest {

    @Test
    void currentMoveThenNextFigureO() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        for (int i = 0; i < Field.getFieldSizeMax(); i++) {
            final Field field = new Field();
            field.setFigure(new Point(i,0), Figure.X);
            field.setFigure(new Point(i,1), Figure.O);
            field.setFigure(new Point(i,2), Figure.X);
            assertEquals(Figure.O, currentMoveController.currentMove(field));
        }
    }

    @Test
    void currentMoveThenNextFigureX() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
            final Field field = new Field();
            field.setFigure(new Point(0,1), Figure.O);
            field.setFigure(new Point(0,2), Figure.X);
            assertEquals(Figure.X, currentMoveController.currentMove(field));
    }

    @Test
    void currentMoveThenNoWinner() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
            final Field field = new Field();
            field.setFigure(new Point(0,0), Figure.X);
            field.setFigure(new Point(0,1), Figure.O);
            field.setFigure(new Point(0,2), Figure.X);
            field.setFigure(new Point(1,0), Figure.O);
            field.setFigure(new Point(1,1), Figure.X);
            field.setFigure(new Point(1,2), Figure.O);
            field.setFigure(new Point(2,0), Figure.X);
            field.setFigure(new Point(2,1), Figure.O);
            field.setFigure(new Point(2,2), Figure.X);

            assertNull(currentMoveController.currentMove(field));
    }
}