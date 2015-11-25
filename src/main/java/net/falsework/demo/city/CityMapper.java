package net.falsework.demo.city;

import java.util.List;

import net.falsework.data.orm.mybatis.Mapper;
import net.falsework.demo.city.City;

@Mapper
public interface CityMapper {
	
	List<City> query(City city);

}
