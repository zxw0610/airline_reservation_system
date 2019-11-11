package airline_reservation_system.entity;

import javax.persistence.Id;
import javax.persistence.Table;

public class Customer {
	
	private int id;
	private String username;
	private String password;
	private String customer_name;
	private int sex;
	private int age;
	private String id_card;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String username, String password, String customer_name, int sex, int age, String id_card) {
		super();
		this.username = username;
		this.password = password;
		this.customer_name = customer_name;
		this.sex = sex;
		this.age = age;
		this.id_card = id_card;
	}
	public Customer(int id, String username, String password, String customer_name, int sex, int age, String id_card) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.customer_name = customer_name;
		this.sex = sex;
		this.age = age;
		this.id_card = id_card;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((customer_name == null) ? 0 : customer_name.hashCode());
		result = prime * result + id;
		result = prime * result + ((id_card == null) ? 0 : id_card.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + sex;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (customer_name == null) {
			if (other.customer_name != null)
				return false;
		} else if (!customer_name.equals(other.customer_name))
			return false;
		if (id != other.id)
			return false;
		if (id_card == null) {
			if (other.id_card != null)
				return false;
		} else if (!id_card.equals(other.id_card))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (sex != other.sex)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", password=" + password + ", customer_name="
				+ customer_name + ", sex=" + sex + ", age=" + age + ", id_card=" + id_card + "]";
	}
	
}
