/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletopLogic;
import java.util.*;

/**
 *
 * @author durvas
 */
public class TableObjectContainer {
    Hashtable objects;
    Hashtable objectsByCreator;
    int counter;

    public void TableObjectContainer(){
        objects = new Hashtable();
        objectsByCreator= new Hashtable();
        counter=0;
    }

    public void addObject(TableObject object){
        int id=counter;
        counter+=1;

        object.id=id;
        objects.put(id, object);

        
    }

    public Collection getObjects(){
        return objects.values();
    }

    public TableObject findObjects(int id){
        return (TableObject)objects.get(id);
    }
}
