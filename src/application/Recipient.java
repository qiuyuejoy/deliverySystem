package application;

public class Recipient extends Person{
	private String address;
	private Preference preference;
	private DeliveryPool deliveryMap;
	
	
	public Recipient(String name, int phone, String address, Preference preference) {
		super(name, phone);
		this.address = address;
		this.preference = preference;
	}


	public String getAddress() {
		return address;
	}


	public Preference getPreference() {
		return preference;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setPreference(Preference preference) {
		this.preference = preference;
	}
	
	public boolean queryDeliveryStatus(String trackingNumber) {
		return deliveryMap.getDeliveryMap().get(trackingNumber).isSigned();
	}


	
}
