package me.y2o2u2n;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void equals() {
		assertThat(Point.of(1, 2)).isEqualTo(Point.of(1, 2));
	}
}