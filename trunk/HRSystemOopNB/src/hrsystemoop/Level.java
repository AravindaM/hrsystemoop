/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop;

/**
 *
 * @author prasath
 */
public enum Level {
    // this enum class will decide us to calculate the base salary depending on the level
    LEVELFIVE(100000,1000),
    LEVELFOUR(80000,800),
    LEVELTHREE(50000,500),
    LEVELTWO(30000,300),
    LEVELONE(20000,200);

    private final int baseSalary;
    private final int overtimeRate;

    Level(int baseSalary, int overtimeRate) {
        this.baseSalary = baseSalary;
        this.overtimeRate = overtimeRate;
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

    // Employer e = new Employer(Level.LEVELONE);
}
