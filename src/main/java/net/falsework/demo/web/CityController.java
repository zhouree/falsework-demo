package net.falsework.demo.web;

import net.falsework.demo.data.City;
import net.falsework.demo.data.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="/create")
    City create() {
		City city = new City("Wu Han","Hubei");
		cityService.save(city);
        return city;
    }

}
