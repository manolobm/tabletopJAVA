/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletopLogic;

/**
 *
 * @author durvas
 */
public class Session {
    Grid sessionGrid;
    public void Session(Grid grid){
        sessionGrid=grid;
    }

    public Grid getSessionGrid(){
        return this.sessionGrid;
    }
}
