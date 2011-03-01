/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

/**
 *
 * @author TOSHIBA
 */
public class AnnualLeave extends Leave{

    static final int maxleaves = 7;
    private int leavetaken;
    private int availableleave;
    private final int none = -1;
    
    public AnnualLeave() {
        if(leavetaken < maxleaves){
            leavetaken++;
        }
        else
            System.out.println("You Have Taken Maximum Leaves, Please Request for Medical Leave");
    }


    private int getAvailableLeaves(){

        availableleave = maxleaves-leavetaken;
        if(availableleave >= 0){
        return availableleave;
        }
        else
            return none;

    }
    
    private int getLeavesTaken(){

        return leavetaken;

    }


}
