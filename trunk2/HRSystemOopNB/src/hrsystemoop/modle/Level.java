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
    LEVELONE(20000, 200, 1000, 14),
    LEVELTWO(30000, 300, 1500, 14),
    LEVELTHREE(50000, 500, 2500, 21),
    LEVELFOUR(80000, 800, 4000, 28),
    LEVELFIVE(100000, 1000, 5000, 28),;

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
        return getBaseSalary() + overtime * getOvertimeRate();
    }

    public int getLeavePenalty() {
        return leavePenalty;
    }

    public int getMaxNoOfLeaves() {
        return maxNoOfLeaves;
    }

    public static Level parseInt(int l) {
        if (l > 5 || l < 1) {
            throw new IllegalArgumentException();
        }
        return values()[l-1];
    }
    // Employer e = new Employer(Level.LEVELONE);
}
