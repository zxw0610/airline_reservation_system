package airline_reservation_system.entity;

public class Airplane {
	private int id;
	private String airplane_id;
	private int max_sail_length;
	private int first_class_seats;
	private int business_class_seats;
	private int economy_class_seats;
	private int ticket_price_id;
	public Airplane() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Airplane(String airplane_id, int max_sail_length, int first_class_seats, int business_class_seats,
			int economy_class_seats, int ticket_price_id) {
		super();
		this.airplane_id = airplane_id;
		this.max_sail_length = max_sail_length;
		this.first_class_seats = first_class_seats;
		this.business_class_seats = business_class_seats;
		this.economy_class_seats = economy_class_seats;
		this.ticket_price_id = ticket_price_id;
	}
	public Airplane(int id, String airplane_id, int max_sail_length, int first_class_seats, int business_class_seats,
			int economy_class_seats, int ticket_price_id) {
		super();
		this.id = id;
		this.airplane_id = airplane_id;
		this.max_sail_length = max_sail_length;
		this.first_class_seats = first_class_seats;
		this.business_class_seats = business_class_seats;
		this.economy_class_seats = economy_class_seats;
		this.ticket_price_id = ticket_price_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirplane_id() {
		return airplane_id;
	}
	public void setAirplane_id(String airplane_id) {
		this.airplane_id = airplane_id;
	}
	public int getMax_sail_length() {
		return max_sail_length;
	}
	public void setMax_sail_length(int max_sail_length) {
		this.max_sail_length = max_sail_length;
	}
	public int getFirst_class_seats() {
		return first_class_seats;
	}
	public void setFirst_class_seats(int first_class_seats) {
		this.first_class_seats = first_class_seats;
	}
	public int getBusiness_class_seats() {
		return business_class_seats;
	}
	public void setBusiness_class_seats(int business_class_seats) {
		this.business_class_seats = business_class_seats;
	}
	public int getEconomy_class_seats() {
		return economy_class_seats;
	}
	public void setEconomy_class_seats(int economy_class_seats) {
		this.economy_class_seats = economy_class_seats;
	}
	public int getTicket_price_id() {
		return ticket_price_id;
	}
	public void setTicket_price_id(int ticket_price_id) {
		this.ticket_price_id = ticket_price_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplane_id == null) ? 0 : airplane_id.hashCode());
		result = prime * result + business_class_seats;
		result = prime * result + economy_class_seats;
		result = prime * result + first_class_seats;
		result = prime * result + id;
		result = prime * result + max_sail_length;
		result = prime * result + ticket_price_id;
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
		Airplane other = (Airplane) obj;
		if (airplane_id == null) {
			if (other.airplane_id != null)
				return false;
		} else if (!airplane_id.equals(other.airplane_id))
			return false;
		if (business_class_seats != other.business_class_seats)
			return false;
		if (economy_class_seats != other.economy_class_seats)
			return false;
		if (first_class_seats != other.first_class_seats)
			return false;
		if (id != other.id)
			return false;
		if (max_sail_length != other.max_sail_length)
			return false;
		if (ticket_price_id != other.ticket_price_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Airplane [id=" + id + ", airplane_id=" + airplane_id + ", max_sail_length=" + max_sail_length
				+ ", first_class_seats=" + first_class_seats + ", business_class_seats=" + business_class_seats
				+ ", economy_class_seats=" + economy_class_seats + ", ticket_price_id=" + ticket_price_id + "]";
	}
	
}
