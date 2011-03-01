/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

/**
 *
 * @author TOSHIBA
 */
public class CasualLeave  extends Leave implements ShortLeave{

    static  final int maxdays = 14;
    private String[] types = {"fullday", "halfday"};
    private String leaveType;

    public CasualLeave() {
    }


    public  void setType(String leaveType){

        this.leaveType = leaveType;

    }

    public  String getLeaveType(){

        return leaveType;
    }



    public int getTotalShortLeaveTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getTotalShortLeaves() {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
