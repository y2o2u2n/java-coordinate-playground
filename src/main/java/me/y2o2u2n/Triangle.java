package me.y2o2u2n;

import java.util.List;
import java.util.Objects;

public class Triangle extends AreaFigure {
	public static final int POINT_COUNT = 3;
	private static final String NAME = "삼각형";

	private final Point a;
	private final Point b;
	private final Point c;

	private Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle(List<Point> points) {
		this(points.get(0), points.get(1), points.get(2));
	}

	public static Triangle of(Point a, Point b, Point c) {
		return new Triangle(a, b, c);
	}

	@Override
	public double area() {
		Line x = Line.of(a, b);
		Line y = Line.of(b, c);
		Line z = Line.of(c, a);
		double xLength = x.length();
		double yLength = y.length();
		double zLength = z.length();
		double s = (xLength + yLength + zLength) / 2;

		return Math.sqrt(s * (s - xLength) * (s - yLength) * (s - zLength));
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
		Triangle triangle = (Triangle)o;
		return Objects.equals(a, triangle.a) && Objects.equals(b, triangle.b)
			&& Objects.equals(c, triangle.c);
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c);
	}
}
