/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
import java.util.Scanner;
public class StartWith {
    String palabra="";
    int i;
    String [] palabras={"hola","ola","casa","caza","mundo","mudo"};
    
    public void palabrapedida(){
        Scanner sc=new Scanner(System.in);
        palabra=sc.nextLine();
    }
    public void buscarpalabra(){
        for (i=0;i<palabras.length;i++){
             if(palabras[i].startsWith(palabra)){
                 System.out.println(palabras[i]);
             } 
        }
        
    }
    public static void main (String[]args){
        StartWith ob1=new StartWith();
        ob1.palabrapedida();
        ob1.buscarpalabra();
        
        
        
    }
}
