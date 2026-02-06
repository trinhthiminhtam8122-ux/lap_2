/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import model.Tour;
import tools.inputter;

/**
 *
 * @author trinhthiminhtam
 */
public class TourManager {

    private HashMap<String, Tour> tourMap;

    public TourManager() {
        this.tourMap = new HashMap<>();
    }

    public void loadFromFile() throws FileNotFoundException, IOException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        BufferedReader br = new BufferedReader(new FileReader("fileUtils/Tours.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }

            String[] tourArr = line.split(",");
            try {
                if (tourArr.length == 9) {
                    String tourID = tourArr[0].trim();
                    String tourName = tourArr[1].trim();
                    String time = tourArr[2].trim();
                    double price = Double.parseDouble(tourArr[3].trim());
                    String homeID = tourArr[4].trim();
                    Date departure_date = date.parse(tourArr[5].trim());
                    Date end_date = date.parse(tourArr[6].trim());
                    int number_Tourist = Integer.parseInt(tourArr[7].trim());
                    boolean booking = Boolean.parseBoolean(tourArr[8].trim());

                    Tour tour = new Tour(tourID, tourName, time, price, homeID, departure_date, end_date, number_Tourist, booking);
                    tourMap.put(tourID, tour);
                }
            } catch (Exception e) {
            }
        }
        br.close();
    }

    public boolean isExistKey(String key) {
        return tourMap.containsKey(key);
    }

    public String calculateTourTime(LocalDate departure, LocalDate end) {
        String day;
        String night;

        long totalDays = ChronoUnit.DAYS.between(departure, end) + 1;
        long totalNights = totalDays - 1;

        if (totalDays == 1) {
            day = "day";
        } else {
            day = "days";
        }

        if (totalNights == 1) {
            night = "night";
        } else {
            night = "nights";
        }

        return totalDays + day + totalNights + night;
    }

    public void addTour(HomestayManager HSMap) throws IOException {
        inputter ndl = new inputter();
        String tourID;
        do {
            tourID = ndl.getTourID();
            if (isExistKey(tourID)) {
                System.out.println("ID is exsit. Please try again!!!");
            }
        } while (isExistKey(tourID));

        String tourName = ndl.getNameTour();
        

        double price = ndl.getPositionDouble();
        
        String homeID;
        do {
            homeID = ndl.getHomeID();
            if (!HSMap.containsKey(homeID)) {
                System.out.println("Homestay ID does not exist! Please try again!!!");
            }
        } while (!HSMap.containsKey(homeID));

        Date departureDate = ndl.getDate("Input departure date of tour: ");
        LocalDate start = departureDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date endDate = ndl.getDate("input end date of tour: ");
        LocalDate end = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int numberTourist = ndl.getPositionInteger("Input number of Tour: ");
        
        String time = calculateTourTime(start, end);
        boolean booking = false;
        
        Tour newTour = new Tour(tourID, tourName, time, price, homeID, departureDate, endDate, numberTourist, booking);
        
        tourMap.put(tourID, newTour);
        System.out.println("Add tour successfully!");
    }
}

