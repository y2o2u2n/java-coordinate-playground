package me.y2o2u2n;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FigureFactoryTest {
	@Test
	void line() {
		List<Point> points = Arrays.asList(
			Point.of(1, 2),
			Point.of(2, 3)
		);

		Figure figure = FigureFactory.create(points);
		assertThat(figure).isNotNull();
		assertThat(figure).isInstanceOf(Line.class);
		assertThat(figure.getName()).isEqualTo("선");
	}

	@Test
	public void rectangle() {
		List<Point> points = Arrays.asList(
			Point.of(1, 1),
			Point.of(4, 1),
			Point.of(1, 4),
			Point.of(4, 4));

		Figure figure = FigureFactory.create(points);
		assertThat(figure).isNotNull();
		assertThat(figure).isInstanceOfAny(Rectangle.class);
		assertThat(figure.getName()).isEqualTo("사각형");
	}

	@Test
	public void triangle() {
		List<Point> points = Arrays.asList(
			Point.of(1, 1),
			Point.of(1, 15),
			Point.of(3, 1));

		Figure figure = FigureFactory.create(points);
		assertThat(figure).isNotNull();
		assertThat(figure).isInstanceOfAny(Triangle.class);
		assertThat(figure.getName()).isEqualTo("삼각형");
	}

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 5})
	public void invalid(int pointCount) {
		List<Point> points = new ArrayList<>();
		for (int i = 0; i < pointCount; i++) {
			points.add(Point.of(1, 1));
		}

		assertThrows(IllegalArgumentException.class, () -> {
			FigureFactory.create(points);
		});
	}
}