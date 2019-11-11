package airline_reservation_system.entity;

import java.util.Date;

public class FlightScheduler {
	private int id;
	private int flight_id;
	private Date start_date;
	private Date end_date;
	private String from_city;
	private String to_city;
	private Date departure_time;
	private Date arrival_time;
	private String airplane_id;
	private String scheduler;
	private int sail_length;
	public FlightScheduler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightScheduler(int flight_id, Date start_date, Date end_date, String from_city, String to_city,
			Date departure_time, Date arrival_time, String airplane_id, String scheduler, int sail_length) {
		super();
		this.flight_id = flight_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.from_city = from_city;
		this.to_city = to_city;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.airplane_id = airplane_id;
		this.scheduler = scheduler;
		this.sail_length = sail_length;
	}
	public FlightScheduler(int id, int flight_id, Date start_date, Date end_date, String from_city, String to_city,
			Date departure_time, Date arrival_time, String airplane_id, String scheduler, int sail_length) {
		super();
		this.id = id;
		this.flight_id = flight_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.from_city = from_city;
		this.to_city = to_city;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.airplane_id = airplane_id;
		this.scheduler = scheduler;
		this.sail_length = sail_length;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getFrom_city() {
		return from_city;
	}
	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}
	public String getTo_city() {
		return to_city;
	}
	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}
	public Date getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(Date departure_time) {
		this.departure_time = departure_time;
	}
	public Date getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(Date arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getAirplane_id() {
		return airplane_id;
	}
	public void setAirplane_id(String airplane_id) {
		this.airplane_id = airplane_id;
	}
	public String getScheduler() {
		return scheduler;
	}
	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}
	public int getSail_length() {
		return sail_length;
	}
	public void setSail_length(int sail_length) {
		this.sail_length = sail_length;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplane_id == null) ? 0 : airplane_id.hashCode());
		result = prime * result + ((arrival_time == null) ? 0 : arrival_time.hashCode());
		result = prime * result + ((departure_time == null) ? 0 : departure_time.hashCode());
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + flight_id;
		result = prime * result + ((from_city == null) ? 0 : from_city.hashCode());
		result = prime * result + id;
		result = prime * result + sail_length;
		result = prime * result + ((scheduler == null) ? 0 : scheduler.hashCode());
		result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
		result = prime * result + ((to_city == null) ? 0 : to_city.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightScheduler other = (FlightScheduler) obj;
		if (airplane_id == null) {
			if (other.airplane_id != null)
				return false;
		} else if (!airplane_id.equals(other.airplane_id))
			return false;
		if (arrival_time == null) {
			if (other.arrival_time != null)
				return false;
		} else if (!arrival_time.equals(other.arrival_time))
			return false;
		if (departure_time == null) {
			if (other.departure_time != null)
				return false;
		} else if (!departure_time.equals(other.departure_time))
			return false;
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
			return false;
		if (flight_id != other.flight_id)
			return false;
		if (from_city == null) {
			if (other.from_city != null)
				return false;
		} else if (!from_city.equals(other.from_city))
			return false;
		if (id != other.id)
			return false;
		if (sail_length != other.sail_length)
			return false;
		if (scheduler == null) {
			if (other.scheduler != null)
				return false;
		} else if (!scheduler.equals(other.scheduler))
			return false;
		if (start_date == null) {
			if (other.start_date != null)
				return false;
		} else if (!start_date.equals(other.start_date))
			return false;
		if (to_city == null) {
			if (other.to_city != null)
				return false;
		} else if (!to_city.equals(other.to_city))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Scheduler [id=" + id + ", flight_id=" + flight_id + ", start_date=" + start_date + ", end_date="
				+ end_date + ", from_city=" + from_city + ", to_city=" + to_city + ", departure_time=" + departure_time
				+ ", arrival_time=" + arrival_time + ", airplane_id=" + airplane_id + ", scheduler=" + scheduler
				+ ", sail_length=" + sail_length + "]";
	}
	
	
}
