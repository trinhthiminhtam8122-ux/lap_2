/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author trinhthiminhtam
 */
public class Booking {
    private String bookingID;
    private String bookingName;
    private String tourID;
    private Date bookingDate;
    private String phone;

    public Booking() {
    }

    public Booking(String bookingID, String bookingName, String tourID, Date bookingDate, String phone) {
        this.bookingID = bookingID;
        this.bookingName = bookingName;
        this.tourID = tourID;
        this.bookingDate = bookingDate;
        this.phone = phone;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingID=" + bookingID + ", bookingName=" + bookingName + ", tourID=" + tourID + ", bookingDate=" + bookingDate + ", phone=" + phone + '}';
    }
    
    
}
