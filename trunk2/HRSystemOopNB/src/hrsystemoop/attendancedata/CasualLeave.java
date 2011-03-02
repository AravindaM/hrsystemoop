/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

import java.util.Date;

/**
 *
 * @author Isha Premadasa
 */
public class CasualLeave  extends Leave {

    static  final int maxleaves = 14;
    private String[] types = {"fullday", "halfday"};
    private String leaveType;

    public CasualLeave(Date date, String reason,String leaveType ) {

     super(date, reason);
     this.leaveType = leaveType;

    }


// Setters and Getters for type and types definitions array

    public  void setLeaveType(String leaveType){

        this.leaveType = leaveType;
    }


    public  String getLeaveType(){

        return leaveType;
    }

    public  void setTypes(String type1, String type2){

            this.types[0] = type1;
            this.types[1] = type2;
    }

    public String[] getTypes(){

        return types;
    }





    

   



}
