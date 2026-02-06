/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.HashMap;

/**
 *
 * @author trinhthiminhtam
 */
public class BookingManager extends HashMap<String, Object>{
    private String bookingFile = "Booking.txt";
    private boolean saved = true;

    public boolean isSaved() {
        return saved;
    }
    
    
    
}
