package me.y2o2u2n;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private List<Car> cars;

	public Cars() {
		this.cars = new ArrayList<>();
	}

	public void add(Car car) {
		this.cars.add(car);
	}
}
