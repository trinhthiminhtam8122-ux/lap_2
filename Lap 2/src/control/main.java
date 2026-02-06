/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import business.HomestayManager;
import business.TourManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tools.inputter;

/**
 *
 * @author trinhthiminhtam
 */
public class main {

    public static void main(String[] args)  {
        TourManager tm = new TourManager();
        HomestayManager hsm = new HomestayManager();
        
        try {
            tm.loadFromFile();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        hsm.readFromFile();

        String[] options = {"Add a new Tour",
            "Update a Tour by ID",
            "List the Tours with departure dates earlier than the current date",
            "Show the total booking amount for tours with departure dates later than the current date",
            "Add a new Booking",
            "Remove a Booking by booking ID",
            "Update a Booking by booking ID",
            "List all bookings by full name or partial full name",
            "Statistics on the total number of tourists who have booked homestays",
            "Quit the program"};

        int choice = 0;

        do {
            choice = inputter.getChoice(options);
            switch (choice) {
                case 1:
                {
                    try {
                        tm.addTour(hsm);
                    } catch (IOException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                }
                    break;

//                case 2:
//
//                    break;
//                case 3:
//
//                    break;
//                case 4:
//
//                    break;
//                case 5:
//
//                    break;
//                case 6:
//
//                    break;
//                case 7:
//
//                    break;
//                case 8:
//
//                    break;
//                case 9:
//
//                    break;
                default:
                    System.out.println("goodbye!!!");
            }

        } while (choice > 0 && choice < 10);

    }
}
