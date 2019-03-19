package ilyas.xo.controllers;

import ilyas.xo.model.Field;
import ilyas.xo.model.Figure;
import ilyas.xo.model.exceptions.AlreadyOccupiedException;
import ilyas.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void apllyFigure(final Field field,
                            final Figure figure,
                            final Point point) throws InvalidPointException,
                                                      AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }
}
