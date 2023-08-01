package application;

import java.util.Collection;
import java.util.HashMap;

public class DeliveryPool {
	private HashMap<String, Delivery> deliveryMap;

	public DeliveryPool() {
		this.deliveryMap = new HashMap<String, Delivery>();
	}

	public HashMap<String, Delivery> getDeliveryMap() {
		return deliveryMap;
	}

	public void setDeliveryMap(HashMap<String, Delivery> deliveryMap) {
		this.deliveryMap = deliveryMap;
	}	
	
	public Collection<Delivery> getDeliveries() {
		return deliveryMap.values();
	}
	
}
