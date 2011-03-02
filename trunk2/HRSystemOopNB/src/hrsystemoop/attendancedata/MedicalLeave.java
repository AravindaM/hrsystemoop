/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.attendancedata;

/**
 *
 * @author Isha Premadasa
 */
public class MedicalLeave extends Leave{


    static  final int maxleaves = 14;
    private int duration;

    public MedicalLeave() {
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getDuration(){

        return duration;
    }
}
