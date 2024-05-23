package entities;

import java.io.Serializable;
import java.util.Objects;

public class order  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int clientId;
	private float total;
	private boolean pay; 
	
	order(){
		
	}

	public order(int id, int clientId, float total, boolean pay) {
		
		this.id = id;
		this.clientId = clientId;
		this.total = total;
		this.pay = pay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clientId, id, pay, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		order other = (order) obj; 
		return clientId == other.clientId && id == other.id && pay == other.pay && Float.floatToIntBits(total) == Float.floatToIntBits(other.total);
	}

	@Override
	public String toString() {
		return "order [id=" + id + ", clientId=" + clientId + ", total=" + total + ", pay=" + pay + "]";
	}

}
