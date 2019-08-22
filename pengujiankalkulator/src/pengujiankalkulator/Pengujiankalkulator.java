/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengujiankalkulator;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class Pengujiankalkulator {

    
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println(" 10 * 2 = "+kalkulator.kali(10, 2)); //hasilnya seharusnya 20
        System.out.println(" 10 / 2 = "+kalkulator.bagi(10, 2)); //hasilnya seharusnya 5
        System.out.println(" 10 + 2 = "+kalkulator.tambah(10, 2)); //hasilnya seharusnya 12
        System.out.println(" 10 - 2 = "+kalkulator.kurang(10, 2)); //hasilnya seharusnya 8
        
    }
    
}
