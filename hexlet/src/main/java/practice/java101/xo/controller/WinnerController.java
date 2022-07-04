package practice.java101.xo.controller;

import practice.java101.xo.exceptions.InvalidPointException;
import practice.java101.xo.model.Field;
import practice.java101.xo.model.Figure;

import java.awt.*;

public class WinnerController {

    public Figure getWinner(final Field field) {

        try {
            for (int i = 0; i < Field.getFieldSizeMax(); i++) {
                if (checkPoint(field, new Point(i, 0),
                        point -> new Point(point.x, point.y + 1))) {
                    return field.getFigure(new Point(i, 0));
                }
            }
            for (int i = 0; i < Field.getFieldSizeMax(); i++) {
                if (checkPoint(field, new Point(0, i),
                        point -> new Point(point.x + 1, point.y))) {
                    return field.getFigure(new Point(0, i));
                }
            }
            if (checkPoint(field, new Point(0, 0),
                    point -> new Point(point.x + 1, point.y + 1))) {
                return field.getFigure(new Point(0, 0));
            }
            if (checkPoint(field, new Point(0, 2),
                    point -> new Point(point.x + 1, point.y - 1))) {
                return field.getFigure(new Point(1, 1));
            }
        } catch (final InvalidPointException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean checkPoint(final Field field,
                               final Point currentPoint,
                               final IPointGenerator pointGenerator) {
        final Figure currentFigure;
        final Figure nextFigure;
        final Point nextPoint = pointGenerator.pointNext(currentPoint);
        try {
            currentFigure = field.getFigure(currentPoint);

            if (currentFigure == null) return false;

            nextFigure = field.getFigure(nextPoint);
        } catch (final InvalidPointException e) {
            return true;
        }

        if (currentFigure != nextFigure) return false;

        return checkPoint(field, nextPoint, pointGenerator);
    }

    private interface IPointGenerator {
        public Point pointNext(final Point point);
    }

    /*try {
            for (int i = 0; i < field.getFieldSizeMax(); i++) {
                if (checkPoint(field, new Point(i, 0), new Point(i, 1), new Point(i, 2))) {
                    return field.getFigure(new Point(i, 0));
                }
            }
            for (int i = 0; i < field.getFieldSizeMax(); i++) {
                if (checkPoint(field, new Point(0, i), new Point(1, i), new Point(2, i))) {
                    return field.getFigure(new Point(0, i));
                }
            }
            if (checkPoint(field, new Point(0, 0), new Point(1, 1), new Point(2, 2))) {
                return field.getFigure(new Point(0, 0));
            }
            if (checkPoint(field, new Point(0, 2), new Point(1, 1), new Point(2, 0))) {
                return field.getFigure(new Point(0, 2));
            }
        } catch (final InvalidPointException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean checkPoint(final Field field, final Point point1, final Point point2, final Point point3) {
        try {
            if (field.getFigure(point1) == null || field.getFigure(point2) == null || field.getFigure(point3) == null) {
                return false;
            }
            if (field.getFigure(point1) == field.getFigure(point2)
                    && field.getFigure(point1) == field.getFigure(point3)) {
                return true;
            }
        } catch (final InvalidPointException e) {
            e.printStackTrace();
        }
        return false;
    }*/
}
