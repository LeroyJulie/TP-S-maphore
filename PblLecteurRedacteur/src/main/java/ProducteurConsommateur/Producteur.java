package ProducteurConsommateur;

import static java.lang.Thread.sleep;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Julie LEROY
 */
public class Producteur extends Thread {
 Stock produits;
 Semaphore spleine, svide;
 public Producteur(Stock produits, Semaphore spleine, Semaphore svide){
     this.produits = produits;
     this.npleine = npleine;
     this.nvide = nvide;
 }
 public void run(){
     while (true){
         try { svide.acquire(); } catch (Exception e) {}
         String produits = "produit numéro "+ produits.size();
         produits.push(produits);
         System.out.println("Le thread "+ getName()+ "est le produit" + produits);
         spleine.release();
         try (sleep(Math.round(Math.random()*2000))) catch(Exception e){}
         
         /*nvide.acquire();
             String produit = "produit"+produit.size();
             produit.push(produit);
             System.out.println("J'ajoute"+produit);
             npleine.release();
         }
         try {sleep (Math.round(Math.random()*5000));
         catsch (Exception e){
         }*/
     }
 }
 }