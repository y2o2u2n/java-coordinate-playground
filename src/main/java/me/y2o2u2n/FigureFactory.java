package me.y2o2u2n;

import java.util.List;

public class FigureFactory {
	public static Figure getInstance(List<Point> points) {
		int pointCount = points.size();

		if (pointCount == Line.POINT_COUNT) {
			return Line.of(points);
		}

		if (pointCount == Rectangle.POINT_COUNT) {
			return Rectangle.of(points);
		}

		return null;
	}
}
