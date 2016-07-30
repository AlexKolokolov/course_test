package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean exists() {
        double a = first.distanceTo(second);
        if (a == 0) return  false;
        double b = first.distanceTo(third);
        if (b == 0) return false;
        double c = second.distanceTo(third);
        if (c == 0) return false;
        if (a + b == c || a + c == b || b + c == a) return false;
        return true;
    }

    public double area() {
        if (!exists()) throw new IllegalStateException();
        double a = first.distanceTo(second);
        double b = first.distanceTo(third);
        double c = second.distanceTo(third);
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return new BigDecimal(s).setScale(5, RoundingMode.HALF_UP).doubleValue();
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public Point getThird() {
        return third;
    }
}
