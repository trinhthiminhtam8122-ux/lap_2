/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trinhthiminhtam
 */
public class inputter {

    private Scanner sc;

    public inputter() {
        this.sc = new Scanner(System.in);;
    }

//    chạy menu 
    public static int getChoice(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }
        System.out.println("input your choice from 1 to " + options.length + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    public String getString(String mess) {
        System.out.println(mess);
        return this.sc.nextLine();
    }

    public String inputAndLoop(String mess, String regex) {
        String input;
        boolean isValue;
        do {
            input = getString(mess);
            isValue = input.matches(regex);
            if (!isValue) {
                System.out.println("Invalid data");
            }
        } while (!isValue);
        return input;
    }

//    về TOUR
    public String getTourID() {
        return inputAndLoop("Input ID of tour: ", Acceptable.TOUR_ID);
    }

    public String getNameTour() {
        return inputAndLoop("Input name of tour: ", Acceptable.TOUR_NAME);
    }

    public String getTime() {
        return inputAndLoop("Input time of tour: ", Acceptable.TOUR_TIME);
    }

    public double getPositionDouble() {
        return Double.parseDouble(inputAndLoop("Input price: ", Acceptable.POSITIVE_DOUBLE_VALUE));
    }

//    về HOMESTAY
    public String getHomeID() {
        return inputAndLoop("Input Home ID: ", Acceptable.HOME_ID);
    }

//    Kiểm tra xem ngày đó có tồn tại hay không
    public boolean isExistDate(String input) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.setLenient(false);
        try {
            sdf.parse(input);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

//    Kiểm tra xem ngày nhập vào có hợp lệ hay không
    public Date getDate(String mess) {
        SimpleDateFormat sdf = new SimpleDateFormat();

        while (true) {
            String input = inputAndLoop(mess, Acceptable.DATE_FORMAT);
            if (isExistDate(input)) {
                try {
                    return sdf.parse(input);
                } catch (Exception e) {
                }
            }
            System.out.println("Invalid day. Please try again!!!");

        }

    }
    
//    Kiểm tra số lượng: số lượng tour, số phòng
    public int getPositionInteger(String mess){
        return Integer.parseInt(inputAndLoop(mess, Acceptable.POSITION_INTEGER_VALID));
    }

}
