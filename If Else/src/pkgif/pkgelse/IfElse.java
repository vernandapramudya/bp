/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgif.pkgelse;

import java.util.Scanner;
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int uang; Scanner s = new Scanner(System.in);
        System.out.println("Bangun Pagi");
        System.out.println("Olah jiwa raga");
        System.out.println("Mandi, bersih-bersih");
        System.out.println("Isi dompet : ");
        uang = s.nextInt ();
        if(uang>10000) {
            System.out.println ("Sarapan dulu");
        }
        System.out.println("Berangkat ke kampus...");
    }
    
}
