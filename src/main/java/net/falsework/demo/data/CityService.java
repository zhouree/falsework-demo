package net.falsework.demo.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CityService {
	
	@Autowired
	private CityDao cityDao;
	
	public void save(City city) {
		cityDao.save(city);
	}

}
