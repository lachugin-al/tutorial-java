package practice.java101.xo.controller;

import practice.java101.xo.exceptions.InvalidPointException;
import practice.java101.xo.model.Field;
import practice.java101.xo.model.Figure;

import java.awt.*;

public class CurrentMoveController {

    public Figure currentMove(final Field field) {
        int countFigure = 0;
        for (int x = 0; x < Field.getFieldSizeMax(); x++) {
            countFigure += countFigureRow(field, x);
        }

        if (countFigure == Field.getFieldSizeMax() * Field.getFieldSizeMax()) {
            return null;
        }

        if (countFigure % 2 == 0) {
            return Figure.X;
        }

        return Figure.O;
    }

    private int countFigureRow(final Field field, final int row) {
        int countFigure = 0;
        for (int y = 0; y < Field.getFieldSizeMax(); y++) {
            try {
                if (field.getFigure(new Point(row, y)) != null) {
                    countFigure++;
                }
            } catch (final InvalidPointException e) {
                e.printStackTrace();
            }
        }
        return countFigure;
    }
}
