/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020materi7;

/**
 *
 * @author Agiftsany Azhar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("15+5 = "+kalkulator.tambah(15, 5));
        System.out.println("19-5 = "+kalkulator.kurang(19, 5));
        System.out.println("12*3 = "+kalkulator.kali(12, 3));
        System.out.println("24/6 = "+kalkulator.bagi(24, 6));
    }
    
}
