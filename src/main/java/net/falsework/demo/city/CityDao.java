package net.falsework.demo.city;

import org.springframework.stereotype.Repository;

import net.falsework.data.orm.hibernate.HibernateDao;

@Repository
public class CityDao extends HibernateDao<City, Long>{

}
