package airline_reservation_system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IAirTicketDao;
import airline_reservation_system.entity.AirTicket;


@Repository("AirTicketDaoImpl")
public class AirTicketDaoImpl implements IAirTicketDao {

	@Autowired
	private JdbcTemplate jt;
	
	//根据id查找信息
	@Override
	public AirTicket select(int id) {
		return jt.queryForObject(
				"select * from t_air_ticket where id=?",
				new Object[]{id},
				new BeanPropertyRowMapper<>(AirTicket.class)
				);
	}

	//查找全部的信息
	@Override
	public List<AirTicket> select() {
		return jt.query(
				"select * from t_air_ticket",
				new BeanPropertyRowMapper<AirTicket>(AirTicket.class)
				);
	}

	//添加信息
	@Override
	public boolean insert(double first_rate_price, double business_price, double economy_price) {
		return jt.update(
				"insert into t_air_ticket(first_rate_price,business_price,economy_price)value(?,?,?)",
				new Object[]{first_rate_price,business_price,economy_price}
				)==1;
	}

	//修改信息
	@Override
	public boolean update(AirTicket at) {
		return jt.update(
				"update t_air_ticket set first_rate_price=?,business_price=?,economy_price=? where id=?",
				new Object[] {at.getFirst_rate_price(),at.getBusiness_price(),at.getEconomy_price(),at.getId()}
				)==1;
	}

	//删除信息
	@Override
	public boolean delete(AirTicket at) {
		return jt.update(
				"delete from t_air_ticket where id=?",
				new Object[] {at.getId()}
				)==1;
	}

}
