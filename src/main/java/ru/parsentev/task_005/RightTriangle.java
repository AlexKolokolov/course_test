package ru.parsentev.task_005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;
import ru.parsentev.task_019.Maze;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        if (!super.exists()) return false;
        double a2 = getFirst().squareDistanceTo(getSecond());
        double b2 = getFirst().squareDistanceTo(getThird());
        double c2 = getSecond().squareDistanceTo(getThird());
        return a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2;
    }
}
