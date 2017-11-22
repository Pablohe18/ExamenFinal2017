/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author Pablo Herrera
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal bambi = new Animal("salvaje", 10, "100 lbs", "cafecito"); 
        ImplLeakyStack history = new ImplLeakyStack<Animal>();
        bambi = (Animal) history.saveHistory(bambi);
        bambi.setSkinColor("cafe´");
        bambi = (Animal) history.saveHistory(bambi);
        bambi.setSkinColor("cafe´ salvaje"); 
        System.out.println(bambi.getSkinColor());
        bambi = (Animal) history.undo(); 
        System.out.println(bambi.getSkinColor());
        bambi = (Animal) history.undo();
    }
    
}
