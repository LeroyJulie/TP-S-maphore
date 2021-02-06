/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbllecteurredacteur;
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
/**
 *
 * @author Julie LEROY
 */
public class Redacteur extends Thread {
    Semaphore s;

public Redacteur(Semaphore s) {
    this.s= s;
}
@Override public void run() {
    while(true) {
        
        try {
            s.acquire();
        } catch (InterruptedException ex) { }
        
        System.out.println(getName() + "Rédacteur "+ getName() + " entre en écriture");
        // section d'écriture
        // un seul rédacteur et aucun lecteur
        System.out.println(getName() + "Rédacteur "+ getName() + " sort de écriture");
        
        s.release();
        
         try {
             sleep(5000);
                } catch (InterruptedException ex) {}


    }
}
}