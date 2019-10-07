/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.gantikata;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055GantiKata {
 public static String input,ganti,menjadi,kalimatBaru;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("====Program Mengganti Kata====");
        Scanner userInput = new Scanner(System.in);
  
        System.out.println("Masukkan Kalimat:");
        input = userInput.nextLine();
        
       
        System.out.println("Ganti Kata:");
        ganti = userInput.next();
        
        
        System.out.print("Menjadi:");
        menjadi = userInput.next();
        kalimatBaru = input.replaceAll(ganti, menjadi);
        
        System.out.println("=====Hasil Formatting=====");
       
        System.out.println("Kalimat awal:"+input);
        
        System.out.println("Kalimat baru:"+kalimatBaru);
        
        
             
    }
    
}
