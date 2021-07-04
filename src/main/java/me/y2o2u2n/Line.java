package me.y2o2u2n;

import java.util.List;
import java.util.Objects;

public class Line extends AbstractFigure {
	public static final int POINT_COUNT = 2;
	private static final String NAME = "선";

	private final Point a;
	private final Point b;

	private Line(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	public Line(List<Point> points) {
		this(points.get(0), points.get(1));
	}

	public static Line of(Point a, Point b) {
		return new Line(a, b);
	}

	public double length() {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPointCount() {
		return POINT_COUNT;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Line line = (Line)o;
		return Objects.equals(a, line.a) && Objects.equals(b, line.b);
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}
}
