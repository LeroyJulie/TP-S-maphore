/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbllecteurredacteur;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

    public class Lecteur extends Thread {
        Semaphore s;
        Semaphore mutex;
        static int compteur= 0;
        
        public Lecteur(Semaphore s,Semaphore mutex) {
            
            this.mutex=mutex;
            this.s= s;
            
        }
        
        @Override public void run() {
            while(true) {         
                
                try {
                    mutex.acquire();
                } catch (InterruptedException ex) {}
                
                compteur++;
                
                if(compteur==1){
                    try {
                        s.acquire();
                    } catch (InterruptedException ex) { }
                }
                
                mutex.release();
                System.out.println(getName() + "Lecteur "+ getName() + " entre en lecture");
                // section de lecture 
                // ok plusieurs lecteurs, mais pas de rédacteurs
                System.out.println( getName() + "Lecteur "+ getName() + " sort de lecture");
                compteur--;
            
                if(compteur==0){
                s.release();}
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {}

                
            }
        }
    }
        
    

