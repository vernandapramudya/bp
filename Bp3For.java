/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bp.pkg3.pkgfor;

import java.util.Scanner;

/**
 *
 * @author VERNANDA
 */
public class Bp3For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
        System.out.println("Program for bilangan angka ganjil");
        System.out.print("Masukkan bilangan angka = ");
        int m = s.nextInt();
        System.out.println("Masukkan bilangan deret angka ganjil");
        int me = 1;
        for (int i = 1; i <= m; i += 2) {
            System.out.println(i + " ");
        }
    }    
}