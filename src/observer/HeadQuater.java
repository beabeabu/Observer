/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class HeadQuater extends Observable {

    private int someData;

    public void setSomeData(int aData) {
    someData = aData;
    setChanged();
    notifyObservers();
    }
    public int getSomeData() {
    return someData;
    }
}
