/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bp.tugas.pkg2.perulangan.bersarang;

/**
 *
 * @author VERNANDA
 */
import java.util.Scanner;
public class BpTugas2PerulanganBersarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan program segitiga bawah:");
        int i, j, segitiga_bawah = s.nextInt();
        System.out.println(" ");
        for(i = 1; i <= segitiga_bawah; i++) {
        for(j = 1; j <= i; j++){
           System.out.print(j+" ");
        }
        System.out.println(" ");    
            
        }   
    }
}
