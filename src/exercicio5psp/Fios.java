/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5psp;


public class Fios extends Thread{
    
    
    public Fios(String nome){
        super(nome);
    }
    
    
    public void run(){
        for(int i=0;i<20;i++){
        System.out.println(" Hola Soy el Hilo :"+getName());
        }
    }
    
    
    
    
    
}
