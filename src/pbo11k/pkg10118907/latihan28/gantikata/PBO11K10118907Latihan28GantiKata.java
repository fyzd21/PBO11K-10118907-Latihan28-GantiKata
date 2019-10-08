/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan ganti kata
 * 
 */
public class PBO11K10118907Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        String nilai = scanner.nextLine();
        
        System.out.print("Ganti kata : ");
        Scanner scanner2 = new Scanner(System.in);
        String kata = scanner2.next();
        
        System.out.print("Menjadi : ");
        Scanner scanner3 = new Scanner(System.in);
        String kata2 = scanner3.next();
        
        format(nilai, kata, kata2);
    }
    
    public static void format(String nilai, String kata, String kata2) {
        System.out.println("Kalimat awal : "+nilai);
        /**
         * Taken and inspired from 
         * https://stackoverflow.com/questions/30183807/java-string-replace-exact-word
         * Question from Oti Na Nai - https://stackoverflow.com/users/4569935/oti-na-nai
         * Solution from hiergiltdiestfu - https://stackoverflow.com/users/958689/hiergiltdiestfu
         */
        System.out.println("Kalimat baru : "+nilai.replaceAll(kata, kata2));
        
    }
    
}
