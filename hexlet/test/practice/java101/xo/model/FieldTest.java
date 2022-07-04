package practice.java101.xo.model;

import org.junit.jupiter.api.Test;
import practice.java101.xo.exceptions.InvalidPointException;
import practice.java101.xo.exceptions.PointAllreadySetException;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void getFieldSize() throws Exception {
        final Field field = new Field();

        assertEquals(3, Field.getFieldSizeMax()); // static поле, обращаемся через класс
        assertEquals(0, Field.getFieldSizeMin());
    }

    @Test
    void setFigure() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.X;
        field.setFigure(inputPoint, inputFigure);
        final Figure outputFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, outputFigure);
    }

    @Test
    void getFigureThenFigureNotSet() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);

        final Figure outputFigure = field.getFigure(inputPoint);

        assertEquals(null, outputFigure);
        // or
        assertNull(outputFigure);
    }

    @Test
    void getFigureThenFigureXSetOutFieldMin() throws Exception {
        final Field field = new Field();
        final int fieldSizeMin = Field.getFieldSizeMin();
        final Point inputPoint = new Point(fieldSizeMin - 1, 0);

        try {
            field.getFigure(inputPoint);
            // в 51 строчке мы ожидаем что перейдет в Exception
            // если дойдет до fail то эксепшен не сработал и тест провалится
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    void getFigureThenFigureYSetOutFieldMin() throws Exception {
        final Field field = new Field();
        final int fieldSizeMin = Field.getFieldSizeMin();
        final Point inputPoint = new Point(0, fieldSizeMin - 1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    void getFigureThenFigureXSetOutFieldMax() throws Exception {
        final Field field = new Field();
        final int fieldSizeMax = Field.getFieldSizeMax();
        final Point inputPoint = new Point(fieldSizeMax + 1, 0);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    void getFigureThenFigureYSetOutFieldMax() throws Exception {
        final Field field = new Field();
        final int fieldSizeMax = Field.getFieldSizeMax();
        final Point inputPoint = new Point(0, fieldSizeMax + 1);

        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {}
    }

    @Test
    void getFigureThenFigureAllreadySet() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigureX = Figure.X;
        final Figure inputFigureO = Figure.O;
        field.setFigure(inputPoint, inputFigureX);

        try {
            field.setFigure(inputPoint, inputFigureO);
            fail();
        } catch (final PointAllreadySetException e) {}
    }

}