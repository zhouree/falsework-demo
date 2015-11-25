package net.falsework.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.falsework.demo.city.City;
import net.falsework.demo.city.CityService;


@RestController
@RequestMapping(value="/city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="/create")
    public City create(@RequestBody City city) {
		
		cityService.create(city);
        return city;
    }
	
	@RequestMapping(value="/query")
	public List<City> query() {
		City city = new City();
		return cityService.query(city);
	}

}
