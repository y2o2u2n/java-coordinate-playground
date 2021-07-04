package me.y2o2u2n;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

	@Test
	void equals() {
		assertThat(Line.of(Point.of(1, 2), Point.of(3, 4)))
			.isEqualTo(Line.of(Point.of(1, 2), Point.of(3, 4)));
	}

	@Test
	void length() {
		Line line = Line.of(Point.of(0, 0), Point.of(3, 4));
		double actual = line.length();
		double expected = 5;

		assertEquals(actual, expected, 1e-15);
	}
}