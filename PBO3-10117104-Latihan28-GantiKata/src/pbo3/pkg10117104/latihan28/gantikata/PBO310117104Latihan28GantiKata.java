/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author
 * Nama      : Aditya Suheryana
 * Nim       : 10117104
 * Kelas     : IF-3/PBO3
 * Deskripsi : Membuat Program Ganti Teks secara manual oleh user
 * 
 */
public class PBO310117104Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String kalimat,ganti,ubah;
    
    System.out.println("================Program Mengganti Kata===============");
    System.out.println("");
    System.out.printf("Masukkan Kalimat : ");
    kalimat = scn.nextLine();
    System.out.printf("Ganti Kata   : ");
    ganti = scn.nextLine();
    System.out.print("Menjadi Kata : ");
    ubah = scn.nextLine();
    
    String jadi = kalimat.replace(ganti, ubah);
        System.out.println("");
        System.out.println("======Hasil Formatting======");
        System.out.println("Kalimat Awal = "+kalimat);
        System.out.println("Kalimat Baru = "+jadi);
    
    
    
    }
    
}
