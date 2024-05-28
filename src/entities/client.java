package entities;

import java.io.Serializable;
import java.util.Objects;

public class client implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name; 
	private String address; 
	private String telephone; 
	
	public client(){
		
	}
	
	public client(String name, String address, String telephone) {
		super();
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	
	public client(int id, String name, String address, String telephone) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, telephone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		client other = (client) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name) && Objects.equals(telephone, other.telephone);
	}

	@Override
	public String toString() {
		return "client [id=" + id + ", name=" + name + ", address=" + address + ", telephone=" + telephone + "]";
	}
}
