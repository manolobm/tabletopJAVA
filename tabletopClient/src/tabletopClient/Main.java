/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletopClient;
/**
 *
 * @author durvas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }

}
