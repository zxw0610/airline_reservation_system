package airline_reservation_system.entity;

public class Website {
	private int id;
	private String username;
	private String password;
	private int website_id;
	private String website_name;
	private String address;
	private String telephone;
	private String province;
	private String city;
	public Website() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Website(String username, String password, int website_id, String website_name, String address,
			String telephone, String province, String city) {
		super();
		this.username = username;
		this.password = password;
		this.website_id = website_id;
		this.website_name = website_name;
		this.address = address;
		this.telephone = telephone;
		this.province = province;
		this.city = city;
	}
	public Website(int id, String username, String password, int website_id, String website_name, String address,
			String telephone, String province, String city) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.website_id = website_id;
		this.website_name = website_name;
		this.address = address;
		this.telephone = telephone;
		this.province = province;
		this.city = city;
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
	public int getWebsite_id() {
		return website_id;
	}
	public void setWebsite_id(int website_id) {
		this.website_id = website_id;
	}
	public String getWebsite_name() {
		return website_name;
	}
	public void setWebsite_name(String website_name) {
		this.website_name = website_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + website_id;
		result = prime * result + ((website_name == null) ? 0 : website_name.hashCode());
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
		Website other = (Website) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (website_id != other.website_id)
			return false;
		if (website_name == null) {
			if (other.website_name != null)
				return false;
		} else if (!website_name.equals(other.website_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Website [id=" + id + ", username=" + username + ", password=" + password + ", website_id=" + website_id
				+ ", website_name=" + website_name + ", address=" + address + ", telephone=" + telephone + ", province="
				+ province + ", city=" + city + "]";
	}
	
}
