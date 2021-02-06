/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PblRendezVous;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Julie LEROY
 */
public class JavaApplication {

    public static void main(String[] args) {
        Semaphore s=new Semaphore(0);
        
        for(int i=0;i<10;i++){
            RendezVous rdv=new RendezVous(10,s);
            rdv.start();
        }
    }
    
}
