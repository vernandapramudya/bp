/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bp.pkg2;

import java.util.Scanner;

/**
 *
 * @author VERNANDA
 */
public class Bp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
        System.out.println(" Program do while bilangan angka ganjil");
        System.out.print("Masukkan bilangan angka = ");
        int m = s.nextInt();
        System.out.println("Masukkan bilangan angka deret ganjil = ");
        int me = 1;
        do {
            System.out.println(me + " ");
            me +=2;
        } while (m >= me);
    }
}
