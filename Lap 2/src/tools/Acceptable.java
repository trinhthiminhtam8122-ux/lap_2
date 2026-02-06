/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author trinhthiminhtam
 */
public interface Acceptable {
    public final String TOUR_ID = "^T\\d{5}$";
    public final String HOME_ID = "^HS\\d{4}";
    public final String TOUR_NAME = "^.{2,25}$";
    public final String TOUR_TIME = "^[a-zA-Z0-9\s+$]";
    public final String DATE_FORMAT = "^\\d{2}/\\d{2}/\\d{4}$";
    public final String POSITIVE_DOUBLE_VALUE = "^(\\d+(\\.[1-9]\\d*)?|[1-9]\\d*(\\.\\d+)?)$";
    public final String POSITION_INTEGER_VALID = "^[1-9]\\d]*$";
}
