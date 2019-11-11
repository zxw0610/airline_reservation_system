package airline_reservation_system.dao.prototy;

import java.util.List;

import airline_reservation_system.entity.Airplane;
import airline_reservation_system.entity.Airport;

/*
 * Airplane接口
 * @author Administrator
 *
 */
public interface IAirplaneDao {
	//根据id查找信息
	Airplane select(int id);
	

	//查询所有信息
	List<Airplane>select();
	
	//添加信息
	boolean insert(String airplane_id, int max_sail_length, int first_class_seats, int business_class_seats,
			int economy_class_seats, int ticket_price_id);
	
	//修改信息
	boolean update(Airplane air);
	
	//删除信息
	boolean delete(Airplane air);
	
	//删除信息
	boolean delete(int id);

	
	
	
	
	
}
