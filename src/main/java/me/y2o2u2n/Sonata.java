package me.y2o2u2n;

public class Sonata extends Car {
	private static final int DISTANCE_PER_LITER = 10;
	private static final String NAME = "Sonata";

	private int tripDistance;

	public Sonata(int tripDistance) {
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
