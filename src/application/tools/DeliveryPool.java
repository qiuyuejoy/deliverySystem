package application.tools;

import java.util.Collection;
import java.util.HashMap;

import application.model.Delivery;

public class DeliveryPool {
	private HashMap<Integer, Delivery> deliveryMap;

	public DeliveryPool() {
		this.deliveryMap = new HashMap<Integer, Delivery>();
	}

	public HashMap<Integer, Delivery> getDeliveryMap() {
		return deliveryMap;
	}

	public void setDeliveryMap(HashMap<Integer, Delivery> deliveryMap) {
		this.deliveryMap = deliveryMap;
	}	
	
	public Collection<Delivery> getDeliveries() {
		return deliveryMap.values();
	}
	
}
