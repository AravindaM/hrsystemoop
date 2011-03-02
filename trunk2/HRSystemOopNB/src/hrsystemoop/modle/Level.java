/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

/**
 *
 * @author prasath
 */
public enum Level {
    // this enum class will decide us to calculate the base salary depending on the level
    LEVELFIVE(100000,1000,5000,28),
    LEVELFOUR(80000,800,4000,28),
    LEVELTHREE(50000,500,2500,21),
    LEVELTWO(30000,300,1500,14),
    LEVELONE(20000,200,1000,14);

    private final int baseSalary;
    private final int overtimeRate;
    private final int leavePenalty;
    private final int maxNoOfLeaves;

    Level(int baseSalary, int overtimeRate, int leavePenalty, int maxnoOfLeaves) {
        this.baseSalary = baseSalary;
        this.overtimeRate = overtimeRate;
        this.leavePenalty = leavePenalty;
        this.maxNoOfLeaves = maxnoOfLeaves;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getOvertimeRate() {
        return overtimeRate;
    }
    
    public int getSalary(int overtime) {
        return getBaseSalary() + overtime*getOvertimeRate();
    }

    public int getLeavePenalty() {
        return leavePenalty;
    }

    public int getMaxNoOfLeaves() {
        return maxNoOfLeaves;
    }

    // Employer e = new Employer(Level.LEVELONE);
}
