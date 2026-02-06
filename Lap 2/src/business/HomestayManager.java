/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Homestay;

/**
 *
 * @author trinhthiminhtam
 */
public class HomestayManager extends HashMap<String, Homestay>{
    private String pathFile = "Homestays.txt";
    private boolean Saved = true;

    public boolean isSaved() {
        return Saved;
    }

    public void readFromFile(){
        File f = new File(pathFile);
        if(!f.exists()){
            System.out.println("Homestays.txt is not found!!!");
            System.exit(0);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(f))){
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
               if(line.isEmpty()) continue;
               String[] HomestayArr = line.split("-");
               if(HomestayArr.length >= 5){
                   String homeID = HomestayArr[0].trim();
                   String homeName = HomestayArr[1].trim();
                   int roomNumber = Integer.parseInt(HomestayArr[2].trim());
                   String address = HomestayArr[3].trim();
                   int maximumCapacity = Integer.parseInt(HomestayArr[4].trim());
                   
                   Homestay hs = new Homestay(homeID, homeName, roomNumber, address, maximumCapacity);
                   this.put(homeID, hs);
               }
            }
                       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomestayManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HomestayManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public boolean isExistID(String homeID){
        return this.containsKey(homeID);
    }
}
