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
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
     
      Stock produits = new Stock();
      
      //initialiser 2 sémaphores, une à 20 et une à 0 avec maximize comme valeur
      Semaphore spleine = new Semaphore (0);
      Semaphore svide = new Semaphore (20);
      
      for (int i=0; i<10; i++)
          new Consommateur (produits, spleine, svide).statrt();
    }}
      
      try { s.acquire();
      }
      catch (InterruptedException ex){}
              int mutex = 1;
              int compteur = 0;
      
        acquire(mutex);
        compteur ++;
        if (compteur ==0) acquire(s);
        release (mutex);
        
                              
// boucle pour remplir la liste de produits. Pour l'exercice récapitutif, la liste doit être vide, donc mise en commentaires
for (int i=0;i<10;i++) {
produits.add("numéro "+i);
//}
    // On crée les producteurs avec la liste produits en paramètre pour qu'elle soit remplie
    // c'est la même liste qui est remplie par les 2 producteurs
    Producteur prod = new Producteur(produits, spleine, svide);
    Producteur prod2 = new Producteur(produits, spleine, svide);
    // On crée les consommateurs avec la liste produits pour qu'elle soit utilisée et vidée
    // C'est la même liste qui est vidée par les 2 consommateurs
    Consommateur cons = new Consommateur(produits, spleine, svide);
    Consommateur cons2 = new Consommateur(produits, spleine, svide);
    // On démarre les producteurs
    prod.start();
    prod2.start();
    // on démarre les consommateurs
    cons.start();
    cons2.start();
    }

    private static void acquire(int mutex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void release(int mutex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
 