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
    LEVELFIVE(100000,1000,5000),
    LEVELFOUR(80000,800,4000),
    LEVELTHREE(50000,500,2500),
    LEVELTWO(30000,300,1500),
    LEVELONE(20000,200,1000);

    private final int baseSalary;
    private final int overtimeRate;
    private final int leavePenalty;

    Level(int baseSalary, int overtimeRate, int leavePenalty) {
        this.baseSalary = baseSalary;
        this.overtimeRate = overtimeRate;
        this.leavePenalty = leavePenalty;
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

    // Employer e = new Employer(Level.LEVELONE);
}
