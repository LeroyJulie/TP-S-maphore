/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbllecteurredacteur;


import java.util.concurrent.Semaphore;


/**
 *
 * @author Julie LEROY
 */
public class JavaApplication {

     public static void main(String[] args) {
        Semaphore mutex = new Semaphore(1);
        Semaphore s=new Semaphore(1);
        
        for(int i=0;i<10;i++){
            Lecteur lecteur1 =new Lecteur(s, mutex);
            lecteur1.start();
        }
        
        for(int i=0;i<10;i++){
            Redacteur redacteur1=new Redacteur(s);
            redacteur1.start();
        }
        
    }
    
}
