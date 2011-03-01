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
    
    public AnnualLeave() {

        leavetaken++;
    }


    private int getAvailableLeaves(){

        availableleave = maxleaves-leavetaken;
        return availableleave;


    }
}
