package fi.haaga.HoteLM.entity;

public class Booking {
    private Long id;
    private String customerName;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;
    private String status;
    private String specialRequests;
    private String paymentMethod;
    private String bookingDate;

    public Booking() {
    }
    public Booking(Long id, String customerName, String roomType, String checkInDate, String checkOutDate, String status, String specialRequests, String paymentMethod, String bookingDate) {
        this.id = id;
        this.customerName = customerName;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
        this.specialRequests = specialRequests;
        this.paymentMethod = paymentMethod;
        this.bookingDate = bookingDate;
    }


}


orehrw