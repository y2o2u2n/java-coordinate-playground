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

	public String generateReport() {
		StringBuilder sb = new StringBuilder();

		for (Car car : this.cars) {
			String report = car.generateReport();
			sb.append(report);
			sb.append(System.getProperty("line.separator"));
		}

		return sb.toString();
	}
}
