package net.falsework.demo.data;

import net.falsework.data.orm.mybatis.Mapper;
import net.falsework.demo.data.City;

@Mapper
public interface CityMapper {
	
	City findOne(Long id);

}
