/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletopLogic;

/**
 *
 * @author durvas
 */

public class Grid {
   String defaultBackground;

   public void Grid(String defaultBackground){
       setDefaultBackground(defaultBackground);
   }

   public String getDefaultBackground(){
    return this.defaultBackground;
   }

   public void setDefaultBackground(String defaultBackground){
       this.defaultBackground=defaultBackground;
   }
}
