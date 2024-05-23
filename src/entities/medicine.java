package entities;

import java.io.Serializable;
import java.util.Objects;

public class medicine  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name; 
	private float price;
	private int quantity;
	
	public medicine(){
		
	}

	public medicine(int id, String name, float price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		medicine other = (medicine) obj;
		return id == other.id && Objects.equals(name, other.name) && Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && quantity == other.quantity;
	}

	@Override
	public String toString() {
		return "medicine [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
