package net.falsework.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityDao cityDao;
	
	@Autowired
	private CityMapper cityMapper;
	
	@Override
	public City create(City city) {
		cityDao.save(city);
		return city;
	}
	
	@Override
	public List<City> query(City city) {
		return cityMapper.query(city);
	}

}
