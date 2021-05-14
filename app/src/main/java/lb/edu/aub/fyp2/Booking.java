package lb.edu.aub.fyp2;

public class Booking {
    int booking_id;
    int user_id;
    int location_id;
    int phone_number;
    int payment;
    String booking_date;
    String start_time;
    String datetime;

    public Booking() {

    }

    public int getBooking_id() {
        return booking_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public int getPayment() {
        return payment;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getDatetime() {
        return datetime;
    }
}

