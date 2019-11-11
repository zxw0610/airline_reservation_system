package airline_reservation_system.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IFlightSchedulerDao;
import airline_reservation_system.entity.FlightScheduler;


@Repository("FlightSchedulerDaoImpl")
public class FlightSchedulerDaoImpl implements IFlightSchedulerDao {

	@Autowired
	private JdbcTemplate jt;
	
	//根据id查询信息
	@Override
	public FlightScheduler select(int id) {
		return  jt.queryForObject(
				"select * from t_flight_scheduler where id=?",
				new Object [] {id},
				new BeanPropertyRowMapper<>(FlightScheduler.class)
				);
	}
	//查询全部信息
	@Override
	public List<FlightScheduler> select() {
		return jt.query(
				"select * from t_flight_scheduler",
				new BeanPropertyRowMapper<FlightScheduler>(FlightScheduler.class)
				);
	}
	
	//添加信息
	@Override
	public boolean insert(int flight_id, Date start_date, Date end_date, String from_city, String to_city,
			Date departure_time, Date arrival_time, String airplane_id, String scheduler, int sail_length) {
		return jt.update(
				"insert into t_flight_scheduler(flight_id,start_date,end_date,from_city,to_city,departure_time, "
				+ "arrival_time,airplane_id,scheduler,sail_length)value(?,?,?,?,?,?,?,?,?,?)",
				new Object[]{flight_id, start_date, end_date, from_city, to_city,
						departure_time, arrival_time, airplane_id, scheduler, sail_length}
				)==1;
	}

	//修改信息
	@Override
	public boolean update(FlightScheduler fs) {
		return jt.update(
				"update t_flight_scheduler set  flight_id=?, start_date=?, end_date=?, from_city=?, to_city=?,departure_time=?, arrival_time=?, airplane_id=?, scheduler=?, sail_length=? where id =?",
				new Object[]{fs.getFlight_id(),fs.getStart_date(),fs.getEnd_date(),fs.getFrom_city(),fs.getTo_city(),fs.getDeparture_time(),fs.getArrival_time(),fs.getAirplane_id(),fs.getScheduler(),fs.getSail_length(),fs.getId()}
				)==1;
	}

	//删除信息
	@Override
	public boolean delete(FlightScheduler fs) {
		return jt.update(
				"delete from t_flight_scheduler where id=?",
				new Object[] {fs.getId()}
				)==1;
	}

}
