package net.falsework.demo.data;

import java.util.List;

import net.falsework.data.orm.mybatis.Mapper;
import net.falsework.demo.data.City;

@Mapper
public interface CityMapper {
	
	List<City> query(City city);

}
