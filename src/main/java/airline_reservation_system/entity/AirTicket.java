package airline_reservation_system.entity;

public class AirTicket {
	private int id;
	private int first_rate_price;
	private int business_price;
	private int economy_price;
	public AirTicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AirTicket(int first_rate_price, int business_price, int economy_price) {
		super();
		this.first_rate_price = first_rate_price;
		this.business_price = business_price;
		this.economy_price = economy_price;
	}
	public AirTicket(int id, int first_rate_price, int business_price, int economy_price) {
		super();
		this.id = id;
		this.first_rate_price = first_rate_price;
		this.business_price = business_price;
		this.economy_price = economy_price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFirst_rate_price() {
		return first_rate_price;
	}
	public void setFirst_rate_price(int first_rate_price) {
		this.first_rate_price = first_rate_price;
	}
	public int getBusiness_price() {
		return business_price;
	}
	public void setBusiness_price(int business_price) {
		this.business_price = business_price;
	}
	public int getEconomy_price() {
		return economy_price;
	}
	public void setEconomy_price(int economy_price) {
		this.economy_price = economy_price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + business_price;
		result = prime * result + economy_price;
		result = prime * result + first_rate_price;
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
		AirTicket other = (AirTicket) obj;
		if (business_price != other.business_price)
			return false;
		if (economy_price != other.economy_price)
			return false;
		if (first_rate_price != other.first_rate_price)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", first_rate_price=" + first_rate_price + ", business_price=" + business_price
				+ ", economy_price=" + economy_price + "]";
	}
	
}
