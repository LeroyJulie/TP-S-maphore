/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProducteurConsommateur;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Julie LEROY
 */
public class Consommateur extends Thread {
   Stock produits;
   Semaphore npleine, nvide;
   
public Consommateur(Stock produits){
    this.produits = produits;
    this.npleine = npleine;
    this.nvide = nvide;
}
public void run (){
    while(true){
        try ( spleine.acquire();) catch (Exception e){}
        String produit = produits.pop();
        System.out.println("Le thread"+ getName()+"retire le produit"+ produit);
        svide.release();
        try ( sleep(Math.round(Math.random()*2000))) catch(Exception e) (System.out.println("Problème avec spleep"))
      }
    }
}          
        
        /*npleine.acquire();// le consommateur reste bloqué car le tableau est vide, le sémaphore vaut -1
            String.produits = produits.pop();
            System.out.println("J'enlève le produit"+ produits);
            nvide.release();
        }
        try { sleep (Math.round(Math.random()*5000))}
        catch (Exception e){}*/
    