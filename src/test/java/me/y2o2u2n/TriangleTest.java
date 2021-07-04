package me.y2o2u2n;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {
	@Test
	void equals() {
		assertThat(
			Triangle.of(
				Point.of(1, 1),
				Point.of(1, 15),
				Point.of(3, 1)))
			.isEqualTo(
				Triangle.of(
					Point.of(1, 1),
					Point.of(1, 15),
					Point.of(3, 1)));
	}

	@Test
	void area() {
		Triangle triangle = Triangle.of(
			Point.of(1, 1),
			Point.of(1, 15),
			Point.of(3, 1));

		double actual = triangle.area();
		double expected = 14;

		assertEquals(actual, expected, 1e-15);
	}
}