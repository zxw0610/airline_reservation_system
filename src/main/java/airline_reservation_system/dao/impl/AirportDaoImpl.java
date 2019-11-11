package airline_reservation_system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IAirportDao;
import airline_reservation_system.entity.Airport;

@Repository("AirportDaoImpl")
public class AirportDaoImpl implements IAirportDao {

	@Autowired
	private JdbcTemplate jt;
	
	//根据id查找信息
	@Override
	public Airport select(int id) {
		return jt.queryForObject(
				"select * from t_airport where id=?",
				new Object[]{id},
				new BeanPropertyRowMapper<>(Airport.class)
				);
	}

	//查询所有信息
	@Override
	public List<Airport> select() {
		return jt.query(
				"select * from t_airport", 
				new BeanPropertyRowMapper<Airport>(Airport.class)
				);
	}

	//添加信息
	@Override
	public boolean insert(String airport_code, String city, String airport_name) {
		return jt.update("insert into t_airport(airport_code,city,airport_name) value (?,?,?)",
				new Object [] {airport_code, city,airport_name}
		)==1;
	}
	
	//修改信息
	@Override
	public boolean update(Airport airp) {
		return jt.update(
				"update t_airport set airport_code=?,city=?,airport_name=? where id=?",
				new Object[]{airp.getAirport_code(),airp.getCity(),airp.getAirport_name(),airp.getId()}
				)==1;
	}

	@Override
	public boolean delete(Airport airp) {
		return jt.update(
				"delete from t_airport where id=?",
				new Object[]{airp.getId()}
				) == 1;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return jt.update(
				"delete from t_airport where id=?",
				new Object[]{id}
				) == 1;
	}

}
