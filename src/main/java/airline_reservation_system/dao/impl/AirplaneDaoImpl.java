package airline_reservation_system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IAirplaneDao;
import airline_reservation_system.entity.Airplane;


/*
 *  Airplane实现类
 * @author Administrator
 *
 */
@Repository("AirplaneDaoImpl")
public class AirplaneDaoImpl implements IAirplaneDao {

	//注入
	@Autowired
	private JdbcTemplate jt;
	
	//通过id查找
	@Override
	public Airplane select(int id) {
		return jt.queryForObject(
				"select * from t_airplane where id=?", 
				new Object[]{id},
				new BeanPropertyRowMapper<>(Airplane.class)
				);
	}

	//查询所有信息
	@Override
	public List<Airplane> select() {
		return jt.query(
				"select * from t_airplane",
				new BeanPropertyRowMapper<Airplane>(Airplane.class)
				);
	}
	
	//添加信息
	@Override
	public boolean insert(String airplane_id, int max_sail_length,int first_class_seats,int business_class_seats,int economy_class_seats,int ticket_price_id) {
		return jt.update(
				"insert into t_airplane(airplane_id,max_sail_length,first_class_seats,business_class_seats,economy_class_seats,ticket_price_id) value(?,?,?,?,?,?)",
				new Object[] {airplane_id,max_sail_length,first_class_seats,business_class_seats,economy_class_seats,ticket_price_id}
				)==1;
	}

	//修改信息
	@Override
	public boolean update(Airplane air) {
		return jt.update(
				"update t_airplane set airplane_id=?,max_sail_length=?,first_class_seats=?,business_class_seats=?,economy_class_seats=?,ticket_price_id=? where id=?" ,
				new Object[] {air.getAirplane_id(),air.getMax_sail_length(),air.getFirst_class_seats(),air.getBusiness_class_seats(),air.getEconomy_class_seats(),air.getTicket_price_id(),air.getId()}
				)==1;
	}

	//删除信息
	@Override
	public boolean delete(Airplane air) {
		return jt.update(
				"delete from t_airplane where id=?",
				new Object[] {air.getId()}
				)==1;
	}

	@Override
	public boolean delete(int id) {
		return jt.update(
				"delete from t_airplane where id=?",
				new Object[] {id}
				)==1;
	}

}
