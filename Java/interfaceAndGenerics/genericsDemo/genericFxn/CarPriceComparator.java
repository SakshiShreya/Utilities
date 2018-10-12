package interfaceAndGenerics.genericsDemo.genericFxn;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car tCar, Car oCar) {
		return oCar.price - tCar.price;
	}
	
}