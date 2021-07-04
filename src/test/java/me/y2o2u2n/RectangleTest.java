package me.y2o2u2n;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	@Test
	void equals() {
		assertThat(
			Rectangle.of(
				Point.of(1, 1),
				Point.of(1, 15),
				Point.of(3, 1),
				Point.of(3, 15)))
			.isEqualTo(
				Rectangle.of(
					Point.of(1, 1),
					Point.of(1, 15),
					Point.of(3, 1),
					Point.of(3, 15)));
	}

	@Test
	void area() {
		Rectangle rectangle = Rectangle.of(
			Point.of(1, 1),
			Point.of(1, 15),
			Point.of(3, 1),
			Point.of(3, 15));

		double actual = rectangle.area();
		double expected = 28;

		assertEquals(actual, expected, 1e-15);
	}
}