package airline_reservation_system.dao.prototy;

import java.util.List;

import airline_reservation_system.entity.Airport;


public interface IAirportDao {
	//根据id查找信息
	Airport select(int id);
	
	//查新所有信息
	List<Airport>select();
	
	//添加信息
	boolean insert(String airport_code,String city,String airport_name);
	
	//修改信息
	boolean update(Airport airp);
	
	//删除信息
	boolean delete(Airport airp);
	//删除信息
	boolean delete(int id);
}
