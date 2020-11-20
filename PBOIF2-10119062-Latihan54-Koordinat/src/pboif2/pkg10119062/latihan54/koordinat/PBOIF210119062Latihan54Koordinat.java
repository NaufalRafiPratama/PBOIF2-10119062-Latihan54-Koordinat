/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * koordinat
 */
public class PBOIF210119062Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WarnaKoordinat objWarnaKoordinat = new WarnaKoordinat("Jingga", 10, 4);
        
        System.out.println("Warna Koordinat : "+objWarnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+objWarnaKoordinat.getX()+", y : "+objWarnaKoordinat.getY());
    }
    
}
