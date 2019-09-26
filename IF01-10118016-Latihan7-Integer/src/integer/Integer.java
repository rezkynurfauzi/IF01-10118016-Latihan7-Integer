/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integer;

/**
 *
 * Nama : Rezky Nur Fauzi
 * NIM  : 10118016  
 * Kelas: IF-1 
 * Deskripsi Program : Menampilkan Nilai integer pada Java
 */
public class Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte b;
        short s;
        int i;
        long l;
        
        b = 120;
        s = 32767;
        i = 1_000_000_000;
        l = 90000000000L;
        
        System.out.println("byte : " + b);
        System.out.println("shor : " + s);
        System.out.println("int  : " + i);
        System.out.println("long : " + l);
    }
    
}
