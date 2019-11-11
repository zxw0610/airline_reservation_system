package airline_reservation_system.entity;

import java.util.Date;

public class FlightInformation {
	private int id;
	private int departure_id;
	private int flight_id;
	private String airport_id;
	private Date departure_date;
	private int first_class_remain_seats;
	private int business_class_remain_seats;
	private int economy_class_remain_seats;
	public FlightInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightInformation(int departure_id, int flight_id, String airport_id, Date departure_date,
			int first_class_remain_seats, int business_class_remain_seats, int economy_class_remain_seats) {
		super();
		this.departure_id = departure_id;
		this.flight_id = flight_id;
		this.airport_id = airport_id;
		this.departure_date = departure_date;
		this.first_class_remain_seats = first_class_remain_seats;
		this.business_class_remain_seats = business_class_remain_seats;
		this.economy_class_remain_seats = economy_class_remain_seats;
	}
	public FlightInformation(int id, int departure_id, int flight_id, String airport_id, Date departure_date,
			int first_class_remain_seats, int business_class_remain_seats, int economy_class_remain_seats) {
		super();
		this.id = id;
		this.departure_id = departure_id;
		this.flight_id = flight_id;
		this.airport_id = airport_id;
		this.departure_date = departure_date;
		this.first_class_remain_seats = first_class_remain_seats;
		this.business_class_remain_seats = business_class_remain_seats;
		this.economy_class_remain_seats = economy_class_remain_seats;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeparture_id() {
		return departure_id;
	}
	public void setDeparture_id(int departure_id) {
		this.departure_id = departure_id;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getAirport_id() {
		return airport_id;
	}
	public void setAirport_id(String airport_id) {
		this.airport_id = airport_id;
	}
	public Date getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}
	public int getFirst_class_remain_seats() {
		return first_class_remain_seats;
	}
	public void setFirst_class_remain_seats(int first_class_remain_seats) {
		this.first_class_remain_seats = first_class_remain_seats;
	}
	public int getBusiness_class_remain_seats() {
		return business_class_remain_seats;
	}
	public void setBusiness_class_remain_seats(int business_class_remain_seats) {
		this.business_class_remain_seats = business_class_remain_seats;
	}
	public int getEconomy_class_remain_seats() {
		return economy_class_remain_seats;
	}
	public void setEconomy_class_remain_seats(int economy_class_remain_seats) {
		this.economy_class_remain_seats = economy_class_remain_seats;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airport_id == null) ? 0 : airport_id.hashCode());
		result = prime * result + business_class_remain_seats;
		result = prime * result + ((departure_date == null) ? 0 : departure_date.hashCode());
		result = prime * result + departure_id;
		result = prime * result + economy_class_remain_seats;
		result = prime * result + first_class_remain_seats;
		result = prime * result + flight_id;
		result = prime * result + id;
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
		FlightInformation other = (FlightInformation) obj;
		if (airport_id == null) {
			if (other.airport_id != null)
				return false;
		} else if (!airport_id.equals(other.airport_id))
			return false;
		if (business_class_remain_seats != other.business_class_remain_seats)
			return false;
		if (departure_date == null) {
			if (other.departure_date != null)
				return false;
		} else if (!departure_date.equals(other.departure_date))
			return false;
		if (departure_id != other.departure_id)
			return false;
		if (economy_class_remain_seats != other.economy_class_remain_seats)
			return false;
		if (first_class_remain_seats != other.first_class_remain_seats)
			return false;
		if (flight_id != other.flight_id)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FlightInformation [id=" + id + ", departure_id=" + departure_id + ", flight_id=" + flight_id
				+ ", airport_id=" + airport_id + ", departure_date=" + departure_date + ", first_class_remain_seats="
				+ first_class_remain_seats + ", business_class_remain_seats=" + business_class_remain_seats
				+ ", economy_class_remain_seats=" + economy_class_remain_seats + "]";
	}
	
}
