package interfaceAndGenerics.genericsDemo.genericFxn;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

	@Override
	public int compare(Car tCar, Car oCar) {
		return tCar.speed - oCar.speed;
	}
	
}
