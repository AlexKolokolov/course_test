package ru.parsentev.task_002;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.*;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Class Point defines a point in coodrional system (x, y).
 * @author parsentev
 * @since 19.07.2016
 */
public class Point {
    private static final Logger log = getLogger(Point.class);

    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(final Point point) {
        return Math.sqrt(squareDistanceTo(point));
    }

    public double squareDistanceTo(final Point point) {
        return (Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2);
    }
}
