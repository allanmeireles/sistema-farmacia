package entities;

import java.io.Serializable;
import java.util.Objects;

public class orderItem  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id; 
	private int orderId;
	private int medicineId; 
	private int quantity; 
	
	orderItem(){
		
	}

	public orderItem(int id, int orderId, int medicineId, int quantity) {
		this.id = id;
		this.orderId = orderId;
		this.medicineId = medicineId;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, medicineId, orderId, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		orderItem other = (orderItem) obj;
		return id == other.id && medicineId == other.medicineId && orderId == other.orderId && quantity == other.quantity;
	}

	@Override
	public String toString() {
		return "orderItem [id=" + id + ", orderId=" + orderId + ", medicineId=" + medicineId + ", quantity=" + quantity
				+ "]";
	}

}
