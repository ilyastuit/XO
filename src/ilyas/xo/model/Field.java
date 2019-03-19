package ilyas.xo.model;

import ilyas.xo.model.exceptions.AlreadyOccupiedException;
import ilyas.xo.model.exceptions.InvalidePointException;

import java.awt.*;

public class Field {

    private final static int FIELD_SIZE = 3;
    private final static int MIN_COORDINATE = 0;
    private final static int MAX_COORDINATE = FIELD_SIZE;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize() {
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point) throws InvalidePointException {
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure)  throws InvalidePointException,
                                                                        AlreadyOccupiedException{
        if (!checkPoint(point)) {
            throw new InvalidePointException();
        }
        if (field[point.x][point.y] != null) {
            throw new AlreadyOccupiedException();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < MAX_COORDINATE;
    }

}
