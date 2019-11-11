package airline_reservation_system.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import airline_reservation_system.dao.prototy.IOrderInformationDao;
import airline_reservation_system.entity.OrderInformation;


@Repository("OrderInformationDaoImpl")
public class OrderInformationDaoImpl implements IOrderInformationDao {
	
	@Autowired
	private JdbcTemplate jt;

	//根据id查找信息
	@Override
	public OrderInformation select(int id) {
		return jt.queryForObject(
				"select * from t_order_information where id=? ",
				new Object[]{id},
				new BeanPropertyRowMapper<>(OrderInformation.class)
                );
	}

	//查询全部信息
	@Override
	public List<OrderInformation> select() {
		return jt.query(
				"select * from t_order_information",
				new BeanPropertyRowMapper<OrderInformation>(OrderInformation.class)
				);
	}

	//添加信息
	@Override
	public boolean insert(int departure_id, String passenger_name, String certification_number, String seat_class,
			int seat_number, double price, Date order_date, int customer_id, int website_id, int shop_assistant_id) {
		return jt.update(
				"insert into t_order_information (departure_id,passenger_name,certification_number, seat_class,seat_number, price,order_date,customer_id,website_id,shop_assistant_id)value(?,?,?,?,?,?,?,?,?,?)",
				new Object[]{departure_id,passenger_name,certification_number, seat_class,seat_number, price,order_date,customer_id,website_id,shop_assistant_id}
				)==1;
	}

	//修改信息
	@Override
	public boolean update(OrderInformation oi) {
		return jt.update(
				"update t_order_information set departure_id=?,passenger_name=?,certification_number=?, seat_class=?,seat_number=?, price=?,order_date=?,customer_id=?,website_id=?,shop_assistant_id=? where id=? ",
				new Object[]{oi.getDeparture_id(),oi.getPassenger_name(),oi.getCertification_number(),oi.getSeat_class(),oi.getSeat_number(),oi.getPrice(),oi.getOrder_date(),oi.getCustomer_id(),oi.getWebsite_id(),oi.getShop_assistant_id(),oi.getId()}
				)==1;
	}

	//删除信息
	@Override
	public boolean delete(OrderInformation oi) {
		return jt.update(
				"delete from t_order_information where id=?",
				new Object []{oi.getId()}
				)==1;
	}

}
