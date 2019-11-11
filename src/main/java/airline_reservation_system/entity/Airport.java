package airline_reservation_system.entity;

public class Airport {
	private int id;
	private String airport_code;
	private String city;
	private String airport_name;
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airport(String airport_code, String city, String airport_name) {
		super();
		this.airport_code = airport_code;
		this.city = city;
		this.airport_name = airport_name;
	}
	public Airport(int id, String airport_code, String city, String airport_name) {
		super();
		this.id = id;
		this.airport_code = airport_code;
		this.city = city;
		this.airport_name = airport_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirport_code() {
		return airport_code;
	}
	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airport_code == null) ? 0 : airport_code.hashCode());
		result = prime * result + ((airport_name == null) ? 0 : airport_name.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
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
		Airport other = (Airport) obj;
		if (airport_code == null) {
			if (other.airport_code != null)
				return false;
		} else if (!airport_code.equals(other.airport_code))
			return false;
		if (airport_name == null) {
			if (other.airport_name != null)
				return false;
		} else if (!airport_name.equals(other.airport_name))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Airport [id=" + id + ", airport_code=" + airport_code + ", city=" + city + ", airport_name="
				+ airport_name + "]";
	}
	
	
}
