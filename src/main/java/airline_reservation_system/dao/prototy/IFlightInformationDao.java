package airline_reservation_system.dao.prototy;

import java.util.Date;
import java.util.List;

import airline_reservation_system.entity.FlightInformation;

public interface IFlightInformationDao {
	//根据id查找信息
	FlightInformation select(int id);
	
	//查新所有信息
	List<FlightInformation>select();
		
	//添加信息
	boolean insert(int departure_id,int flight_id,String airport_id,Date departure_date,int first_class_remain_seats,int business_class_remain_seats,int economy_class_remain_seats);
		
	//修改信息
	boolean update(FlightInformation fit);
		
	//删除信息
	boolean delete(FlightInformation fit);
	boolean delete(int id);
}
