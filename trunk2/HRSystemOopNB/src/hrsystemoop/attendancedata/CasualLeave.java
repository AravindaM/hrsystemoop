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

    static  final int maxhours = 56;
    private String[] type = {"fullday", "halfday"};

    public CasualLeave() {
    }

    public int getTotalShortLeaveTime() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getTotalShortLeaves() {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
