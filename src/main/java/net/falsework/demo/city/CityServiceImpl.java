package net.falsework.demo.city;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@CacheConfig(cacheNames = "cityCache")
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
	@Cacheable
	public List<City> query(City city) {
		return cityMapper.query(city);
	}

}
