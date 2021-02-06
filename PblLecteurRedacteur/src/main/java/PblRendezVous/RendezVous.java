/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PblRendezVous;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Julie LEROY
 */
public class RendezVous extends Thread {
    
    int n = 10;
    Semaphore s; 
    static int compteur = 0;
    
    public RendezVous(int n, Semaphore s) {
        this.n = n;
        this.s = s;
    }    
    @Override
       public void run() {
           System.out.println(getName()+ "débute sa première partie");
           
        try {
            sleep(500);
        } catch (InterruptedException ex) {}
        
           compteur++;
           
           if (compteur!=n){
        try {
            s.acquire();
        } catch (InterruptedException ex) {}
           }
        
            s.release();
        
           System.out.println (getName()+ "débute sa seconde partie");}
}