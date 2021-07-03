package me.y2o2u2n;

public class K5 extends Car {
	private static final int DISTANCE_PER_LITER = 13;
	private static final String NAME = "K5";

	private int tripDistance;

	public K5(int tripDistance) {
		this.tripDistance = tripDistance;
	}

	@Override
	double getDistancePerLiter() {
		return DISTANCE_PER_LITER;
	}

	@Override
	double getTripDistance() {
		return this.tripDistance;
	}

	@Override
	String getName() {
		return NAME;
	}
}
