package airline_reservation_system.entity;
public class ShopAssistant {
	private int id;
	private String username;
	private String password;
	private int assistant_id;
	private String assistant_name;
	private int website_id;
	public ShopAssistant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopAssistant(String username, String password, int assistant_id, String assistant_name, int website_id) {
		super();
		this.username = username;
		this.password = password;
		this.assistant_id = assistant_id;
		this.assistant_name = assistant_name;
		this.website_id = website_id;
	}
	public ShopAssistant(int id, String username, String password, int assistant_id, String assistant_name,
			int website_id) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.assistant_id = assistant_id;
		this.assistant_name = assistant_name;
		this.website_id = website_id;
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
	public int getAssistant_id() {
		return assistant_id;
	}
	public void setAssistant_id(int assistant_id) {
		this.assistant_id = assistant_id;
	}
	public String getAssistant_name() {
		return assistant_name;
	}
	public void setAssistant_name(String assistant_name) {
		this.assistant_name = assistant_name;
	}
	public int getWebsite_id() {
		return website_id;
	}
	public void setWebsite_id(int website_id) {
		this.website_id = website_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assistant_id;
		result = prime * result + ((assistant_name == null) ? 0 : assistant_name.hashCode());
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		ShopAssistant other = (ShopAssistant) obj;
		if (assistant_id != other.assistant_id)
			return false;
		if (assistant_name == null) {
			if (other.assistant_name != null)
				return false;
		} else if (!assistant_name.equals(other.assistant_name))
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (website_id != other.website_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ShopAssistant [id=" + id + ", username=" + username + ", password=" + password + ", assistant_id="
				+ assistant_id + ", assistant_name=" + assistant_name + ", website_id=" + website_id + "]";
	}
	
}
