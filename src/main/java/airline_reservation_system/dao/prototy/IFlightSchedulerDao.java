package airline_reservation_system.dao.prototy;

import java.util.Date;
import java.util.List;

import airline_reservation_system.entity.FlightScheduler;



public interface IFlightSchedulerDao {
	//根据id查找信息
	FlightScheduler select(int id);
		
	//查新所有信息
	List<FlightScheduler>select();
			
	//添加信息
	boolean insert(int flight_id,Date start_date,Date end_date,String from_city,String to_city,Date departure_time,Date arrival_time,String airplane_id,String scheduler,int sail_length);
			
	//修改信息
	boolean update(FlightScheduler fs);
			
	//删除信息
	boolean delete(FlightScheduler fs);
}
