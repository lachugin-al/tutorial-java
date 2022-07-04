package practice.java101.xo.controller;

import org.junit.jupiter.api.Test;
import practice.java101.xo.exceptions.InvalidPointException;
import practice.java101.xo.exceptions.PointAllreadySetException;
import practice.java101.xo.model.Field;
import practice.java101.xo.model.Figure;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MoveControllerTest {

    @Test
    void applyFigureInAllreadySetPoint() throws Exception {
        final MoveController moveController = new MoveController();
        final Point inputPoint = new Point(0,0);
        final Figure inputFigure = Figure.X;
        final Field field = new Field();
        moveController.applyFigure(inputPoint, field, inputFigure);
        moveController.applyFigure(inputPoint, field, inputFigure);
        try {
            field.setFigure(inputPoint, inputFigure);
            fail();
        } catch (final InvalidPointException | PointAllreadySetException e) {}
    }

    @Test
    void applyFigureInvalidSetPoint() throws Exception {
        final MoveController moveController = new MoveController();
        final Point inputPoint = new Point(-1,0);
        final Figure inputFigure = Figure.X;
        final Field field = new Field();
        moveController.applyFigure(inputPoint, field, inputFigure);
        try {
            field.setFigure(inputPoint, inputFigure);
            fail();
        } catch (final InvalidPointException | PointAllreadySetException e) {}
    }
}