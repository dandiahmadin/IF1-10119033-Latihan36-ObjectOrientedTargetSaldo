/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.targetsaldo;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung saldo tabungan untuk mencapai target saldo
 * dengan konsep pendekatan berbasis objek
 */
public class IF110119033Latihan36TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TargetSaldo tabungan = new TargetSaldo();
        
        tabungan.bunga = 8;
        tabungan.saldo = 3500000;
        tabungan.target = 6000000;
        tabungan.cetakHasil();
   }
    
}
