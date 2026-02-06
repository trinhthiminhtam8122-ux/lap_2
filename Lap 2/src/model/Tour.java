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
public class Tour {
    private String tourID;
    private String tourName;
    private String time;
    private double price;
    private String homeID;
    private Date departure_date;
    private Date end_date;
    private int number_Tourist;
    private boolean booking;

    public Tour() {
    }

    public Tour(String tourID, String tourName, String time, double price, String homeID, Date departure_date, Date end_date, int number_Tourist) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.time = time;
        this.price = price;
        this.homeID = homeID;
        this.departure_date = departure_date;
        this.end_date = end_date;
        this.number_Tourist = number_Tourist;
        this.booking = false;
    }

    public Tour(String tourID, String tourName, String time, double price, String homeID, Date departure_date, Date end_date, int number_Tourist, boolean booking) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.time = time;
        this.price = price;
        this.homeID = homeID;
        this.departure_date = departure_date;
        this.end_date = end_date;
        this.number_Tourist = number_Tourist;
        this.booking = booking;
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHomeID() {
        return homeID;
    }

    public void setHomeID(String homeID) {
        this.homeID = homeID;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getNumber_Tourist() {
        return number_Tourist;
    }

    public void setNumber_Tourist(int number_Tourist) {
        this.number_Tourist = number_Tourist;
    }

    public boolean isBooking() {
        return booking;
    }

    public void setBooking(boolean booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Tour{" + "tourID=" + tourID + ", tourName=" + tourName + ", time=" + time + ", price=" + price + ", homeID=" + homeID + ", departure_date=" + departure_date + ", end_date=" + end_date + ", number_Tourist=" + number_Tourist + ", booking=" + booking + '}';
    }
    
    
    
    
    
}
