package application.model;

public class Delivery {
	private String trackingNumber;
	private String recipientName;
	private boolean isSigned;
	
	public Delivery(String trackingNumber, String recipientName) {
        this.trackingNumber = trackingNumber;
        this.recipientName = recipientName;
        this.isSigned = false;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public Boolean isSigned() {
        return isSigned;
    }

    public void setSigned(boolean signed) {
        this.isSigned = signed;
    }
    
    @Override
    public String toString() {
        return "Tracking Number: " + trackingNumber + ",\nRecipient: " + recipientName + ",\nSigned: " + isSigned;
    }
//    
//    public void printDeliveryInfo() {
//    	System.out.println("Tracking Number: " + trackingNumber + ",\nRecipient: " + recipientName + ",\nSigned: " + isSigned);
//    }
}

//1. 还可以加什么method
//2. SceneBuilder -- java event-trigger
//3. 加功能：method（1）， 运转起来（2）





    

