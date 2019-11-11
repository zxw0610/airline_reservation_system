package airline_reservation_system.entity;

import java.util.Date;

public class OrderInformation {
	private int id;
	private int departure_id;
	private String passenger_name;
	private String certification_number;
	private String seat_class;
	private int seat_number;
	private double price;
	private Date order_date;
	private int customer_id;
	private int website_id;
	private int shop_assistant_id;
	public OrderInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderInformation(int departure_id, String passenger_name, String certification_number, String seat_class,
			int seat_number, double price, Date order_date, int customer_id, int website_id, int shop_assistant_id) {
		super();
		this.departure_id = departure_id;
		this.passenger_name = passenger_name;
		this.certification_number = certification_number;
		this.seat_class = seat_class;
		this.seat_number = seat_number;
		this.price = price;
		this.order_date = order_date;
		this.customer_id = customer_id;
		this.website_id = website_id;
		this.shop_assistant_id = shop_assistant_id;
	}
	public OrderInformation(int id, int departure_id, String passenger_name, String certification_number,
			String seat_class, int seat_number, double price, Date order_date, int customer_id, int website_id,
			int shop_assistant_id) {
		super();
		this.id = id;
		this.departure_id = departure_id;
		this.passenger_name = passenger_name;
		this.certification_number = certification_number;
		this.seat_class = seat_class;
		this.seat_number = seat_number;
		this.price = price;
		this.order_date = order_date;
		this.customer_id = customer_id;
		this.website_id = website_id;
		this.shop_assistant_id = shop_assistant_id;
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
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getCertification_number() {
		return certification_number;
	}
	public void setCertification_number(String certification_number) {
		this.certification_number = certification_number;
	}
	public String getSeat_class() {
		return seat_class;
	}
	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}
	public int getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getWebsite_id() {
		return website_id;
	}
	public void setWebsite_id(int website_id) {
		this.website_id = website_id;
	}
	public int getShop_assistant_id() {
		return shop_assistant_id;
	}
	public void setShop_assistant_id(int shop_assistant_id) {
		this.shop_assistant_id = shop_assistant_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((certification_number == null) ? 0 : certification_number.hashCode());
		result = prime * result + customer_id;
		result = prime * result + departure_id;
		result = prime * result + id;
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		result = prime * result + ((passenger_name == null) ? 0 : passenger_name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((seat_class == null) ? 0 : seat_class.hashCode());
		result = prime * result + seat_number;
		result = prime * result + shop_assistant_id;
		result = prime * result + website_id;
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
		OrderInformation other = (OrderInformation) obj;
		if (certification_number == null) {
			if (other.certification_number != null)
				return false;
		} else if (!certification_number.equals(other.certification_number))
			return false;
		if (customer_id != other.customer_id)
			return false;
		if (departure_id != other.departure_id)
			return false;
		if (id != other.id)
			return false;
		if (order_date == null) {
			if (other.order_date != null)
				return false;
		} else if (!order_date.equals(other.order_date))
			return false;
		if (passenger_name == null) {
			if (other.passenger_name != null)
				return false;
		} else if (!passenger_name.equals(other.passenger_name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (seat_class == null) {
			if (other.seat_class != null)
				return false;
		} else if (!seat_class.equals(other.seat_class))
			return false;
		if (seat_number != other.seat_number)
			return false;
		if (shop_assistant_id != other.shop_assistant_id)
			return false;
		if (website_id != other.website_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderInformation [id=" + id + ", departure_id=" + departure_id + ", passenger_name=" + passenger_name
				+ ", certification_number=" + certification_number + ", seat_class=" + seat_class + ", seat_number="
				+ seat_number + ", price=" + price + ", order_date=" + order_date + ", customer_id=" + customer_id
				+ ", website_id=" + website_id + ", shop_assistant_id=" + shop_assistant_id + "]";
	}
	
}
