package me.y2o2u2n;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

public class Rectangle extends AreaFigure {
	public static final int POINT_COUNT = 4;
	private static final String NAME = "사각형";

	private final Point a;
	private final Point b;
	private final Point c;
	private final Point d;

	private Rectangle(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public static Rectangle of(Point a, Point b, Point c, Point d) {
		return new Rectangle(a, b, c, d);
	}

	public static Rectangle of(List<Point> points) {
		if (points.size() != POINT_COUNT) {
			throw new IllegalArgumentException();
		}

		return Rectangle.of(
			points.get(0),
			points.get(1),
			points.get(2),
			points.get(3));
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
	public double area() {
		List<Point> points = Arrays.asList(a, b, c, d);
		int differenceOfXValues = calculateDifference(convertToUniqueXValues(points));
		int differenceOfYValues = calculateDifference(convertToUniqueYValues(points));

		return differenceOfXValues * differenceOfYValues;
	}

	private Set<Integer> convertToUniqueXValues(List<Point> points) {
		return convertToUniqueValues(points, Point::getX);
	}

	private Set<Integer> convertToUniqueYValues(List<Point> points) {
		return convertToUniqueValues(points, Point::getY);
	}

	private Set<Integer> convertToUniqueValues(List<Point> points, Function<Point, Integer> function) {
		return points.stream()
			.map(function)
			.collect(toSet());
	}

	private int calculateDifference(Set<Integer> valuesOfPoints) {
		List<Integer> values = new ArrayList<>(valuesOfPoints);
		return Math.abs(values.get(0) - values.get(1));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Rectangle rectangle = (Rectangle)o;
		return Objects.equals(a, rectangle.a) && Objects.equals(b, rectangle.b)
			&& Objects.equals(c, rectangle.c) && Objects.equals(d, rectangle.d);
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c, d);
	}
}
