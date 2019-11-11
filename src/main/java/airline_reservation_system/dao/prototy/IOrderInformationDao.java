package airline_reservation_system.dao.prototy;

import java.util.Date;
import java.util.List;

import airline_reservation_system.entity.OrderInformation;


public interface IOrderInformationDao {
	//根据id查找信息
	OrderInformation select(int id);
		
	//查新所有信息
	List<OrderInformation>select();
			
	//添加信息
	boolean insert(int departure_id,String passenger_name,String certification_number,String seat_class,int seat_number, double price,Date order_date,int customer_id,int website_id,int  shop_assistant_id);
			
	//修改信息
	boolean update(OrderInformation oi);
			
	//删除信息
	boolean delete(OrderInformation oi);
}
