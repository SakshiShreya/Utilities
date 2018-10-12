package interfaceAndGenerics.genericsDemo.genericFxn;

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car> {

	@Override
	public int compare(Car tCar, Car oCar) {
		return tCar.color.compareTo(oCar.color);
	}
	
}