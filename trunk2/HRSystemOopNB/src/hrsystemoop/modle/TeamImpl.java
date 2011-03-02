/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrsystemoop.modle;

import java.util.Vector;

/**
 *
 * @author prasath
 */
public class TeamImpl {

    Vector<HRAssistantImpl> teamMembers;

    public TeamImpl() {
        teamMembers = new Vector<HRAssistantImpl>();
    }

    public void addTeamMember(HRAssistantImpl assistant) {
        teamMembers.add(assistant);
    }

}
