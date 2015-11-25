package net.falsework.demo.city;

import java.util.List;

public interface CityService {
	
	City create(City city);

	List<City> query(City city);

}
