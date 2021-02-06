/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProducteurConsommateur;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author Julie LEROY
 */
public class NewClass1 {
    
    public class monThread extends Thread {
        @Override
        public void run(){
                for (int i = 0; i < 10; i++){
                    // La méthode getName() renvoie le nom du thread
                    System.out.println("coucou de la part du thread" + getName());
                }
                System.out.println("Je suis le thread "+getName()+" et j'ai fini");
        }
    }
}
    
        
    