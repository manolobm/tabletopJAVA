/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletopLogic;

/**
 *
 * @author durvas
 */
public class TableObject {
    int i,j,z,id;
    String imagePath, name, type,creator;

    public void TableObject(String imagePath, String name, String type,
                            String creator, int i, int j, int z){
        this.i=i;
        this.j=j;
        this.z=z;
        this.name=name;
        this.type = type;
        this.imagePath=imagePath;
        this.creator=creator;
    }
}
