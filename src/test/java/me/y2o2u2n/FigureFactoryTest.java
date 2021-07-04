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
}