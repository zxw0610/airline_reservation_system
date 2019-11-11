package airline_reservation_system.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IFlightInformationDao;
import airline_reservation_system.entity.FlightInformation;


@Repository("FlightInformationDaoImpl")
public class FlightInformationDaoImpl implements IFlightInformationDao {
	
	@Autowired
	private JdbcTemplate jt;

	//根据id查找信息
	@Override
	public FlightInformation select(int id) {
		return jt.queryForObject(
				"select * from t_flight_information where id=?",
				new Object [] {id},
				new BeanPropertyRowMapper<>(FlightInformation.class)
                );
	}

	//查询所有信息
	@Override
	public List<FlightInformation> select() {
		return jt.query(
				"select * from t_flight_information ",
				new BeanPropertyRowMapper<FlightInformation>(FlightInformation.class)
				);
	}

	//添加信息
	@Override
	public boolean insert(int departure_id, int flight_id, String airport_id, Date departure_date,
			int first_class_remain_seats, int business_class_remain_seats, int economy_class_remain_seats) {
		return jt.update(
				"insert into t_flight_information(departure_id,flight_id,airport_id,departure_date,first_class_remain_seats,business_class_remain_seats,economy_class_remain_seats) value(?,?,?,?,?,?,?)",
				new Object[]{departure_id,flight_id,airport_id,departure_date,first_class_remain_seats,business_class_remain_seats,economy_class_remain_seats}
				)==1;
	}

	//修改信息
	@Override
	public boolean update(FlightInformation fit) {
		
		return jt.update(
				"update t_flight_information set departure_id=?,flight_id=?,airport_id=?,departure_date=?,first_class_remain_seats=?,business_class_remain_seats=?,economy_class_remain_seats=? where id=?",
				new Object[]{fit.getDeparture_id(),fit.getFlight_id(),fit.getAirport_id(),fit.getDeparture_date(),fit.getFirst_class_remain_seats(),fit.getBusiness_class_remain_seats(),fit.getEconomy_class_remain_seats(),fit.getId()}
				)==1;
	}

	//删除信息
	@Override
	public boolean delete(FlightInformation fit) {
		return jt.update(
				"delete from t_flight_information where id=?",
				new Object[]{fit.getId()}
				)==1;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return jt.update(
				"delete from t_flight_information where id=?",
				new Object[]{id}
				)==1;
	}

}
