package net.falsework.demo.data;

import java.util.List;

public interface CityService {
	
	City create(City city);

	List<City> query(City city);

}
