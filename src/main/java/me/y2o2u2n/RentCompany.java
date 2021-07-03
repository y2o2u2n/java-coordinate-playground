package me.y2o2u2n;

public class RentCompany {
	private Cars cars;

	private RentCompany() {
		this.cars = new Cars();
	}

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public String generateReport() {
		return null;
	}
}
