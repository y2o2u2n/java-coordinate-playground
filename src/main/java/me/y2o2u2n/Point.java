package me.y2o2u2n;

import java.util.Objects;

public class Point extends AbstractFigure {
	private static final String NAME = "좌표";
	private static final int POINT_COUNT = 1;
	private static final int MAX = 24;

	private final int x;
	private final int y;

	private Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static Point of(int x, int y) {
		if (x >= MAX || y >= MAX) {
			throw new IllegalArgumentException();
		}

		return new Point(x, y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
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
		Point point = (Point)o;
		return x == point.x && y == point.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
}
