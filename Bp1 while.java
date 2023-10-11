/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bp.pkg1;

/**
 *
 * @author VERNANDA
 */
import java.util.Scanner;
public class Bp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Program while");
        System.out.print("Masukkan bilangan angka = ");
        int m = s.nextInt();
        System.out.println("Masukkan bilangan angka ganjil");
        int me = 1;
        while (m >= me) {
            System.out.println(me + " ");
            me += 2;
        }
    }
}    