package practice.java101.xo.controller;

import practice.java101.xo.exceptions.InvalidPointException;
import practice.java101.xo.exceptions.PointAllreadySetException;
import practice.java101.xo.model.Field;
import practice.java101.xo.model.Figure;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Point point,
                            final Field field,
                            final Figure figure) {
        try {
            field.setFigure(point, figure);
        } catch (final InvalidPointException | PointAllreadySetException e) {
            e.printStackTrace();
            System.out.print("Point is invalid!");
        }
    }

}
