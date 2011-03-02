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


    public  void setType(String leaveType){

        this.leaveType = leaveType;

    }

    public  String getLeaveType(){

        return leaveType;
    }

    public String[] getTypes(){

        return types;
    }





    

   



}
