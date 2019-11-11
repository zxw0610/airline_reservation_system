package airline_reservation_system.dao.prototy;

import java.util.List;

import airline_reservation_system.entity.AirTicket;


public interface IAirTicketDao {
	//根据id查找信息
	AirTicket select(int id);
		
	//查新所有信息
	List<AirTicket>select();
		
	//添加信息
	boolean insert(double first_rate_price,double business_price,double economy_price);
		
	//修改信息
	boolean update(AirTicket at);
		
	//删除信息
	boolean delete(AirTicket at);
}
