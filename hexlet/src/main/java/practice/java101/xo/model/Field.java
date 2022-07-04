package practice.java101.xo.model;

import practice.java101.xo.exceptions.InvalidPointException;
import practice.java101.xo.exceptions.PointAllreadySetException;

import java.awt.*;

public class Field {
    private static final int FIELD_SIZE_MAX = 3;
    private static final int FIELD_SIZE_MIN = 0;
    private final Figure[][] figures = new Figure[FIELD_SIZE_MAX][FIELD_SIZE_MAX];    // поле состоит из массива фигур

    public static int getFieldSizeMax() {
        return FIELD_SIZE_MAX;
    }
    public static int getFieldSizeMin() {
        return FIELD_SIZE_MIN;
    }

    //  получаем объект Figure по координатам x,y в массиве Figure[][]
    public Figure getFigure(final Point point) throws InvalidPointException {
        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }
        return figures[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidPointException, PointAllreadySetException {
        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }
        if (figures[point.x][point.y] != null) {
            throw new PointAllreadySetException();
        }
        figures[point.x][point.y] = figure;
    }

    // проверяем x/y
    public boolean checkPoint(final Point point) {
        return checkXOrYCoordinate(point.x) && checkXOrYCoordinate(point.y);
    }

    // проверяем координату
    public boolean checkXOrYCoordinate(final int coordinate) {
        return coordinate >= FIELD_SIZE_MIN && coordinate < FIELD_SIZE_MAX;
    }

}
