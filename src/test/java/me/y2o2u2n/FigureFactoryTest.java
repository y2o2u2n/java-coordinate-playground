package me.y2o2u2n;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FigureFactoryTest {
	@Test
	void line() {
		List<Point> points = Arrays.asList(
			Point.of(1, 2),
			Point.of(2,3)
		);

		Figure figure = FigureFactory.getInstance(points);
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

		Figure figure = FigureFactory.getInstance(points);
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

		Figure figure = FigureFactory.getInstance(points);
		assertThat(figure).isNotNull();
		assertThat(figure).isInstanceOfAny(Triangle.class);
		assertThat(figure.getName()).isEqualTo("삼각형");
	}
}