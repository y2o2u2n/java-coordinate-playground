package me.y2o2u2n;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {
	private static final Map<Integer, Function<List<Point>, Figure>> classifier = new HashMap<>();

	static {
		classifier.put(Line.POINT_COUNT, Line::new);
		classifier.put(Triangle.POINT_COUNT, Triangle::new);
		classifier.put(Rectangle.POINT_COUNT, Rectangle::new);
	}

	public static Figure create(List<Point> points) {
		if (points == null) {
			throw new IllegalArgumentException();
		}

		Function<List<Point>, Figure> function = classifier.get(points.size());
		if (function == null) {
			throw new IllegalArgumentException();
		}

		return function.apply(points);
	}
}
