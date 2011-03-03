/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author prasath
 */
public class TeamImpl {

    private ArrayList<HRAssistant> teamMembers;

    public TeamImpl() {
        teamMembers = new ArrayList<HRAssistant>();
    }

    public void addTeamMember(HRAssistant assistant) {
        teamMembers.add(assistant);
    }

}
