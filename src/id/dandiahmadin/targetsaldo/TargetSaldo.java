/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.targetsaldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 KELAS    : IF-1
 NIM      : 10119033
 Deskripsi Program : Program ini berisi class TargetSaldo
 */
public class TargetSaldo {
    public int saldo, target;
    public double bunga;
    
    private double hitungBunga(double parBunga) {
        return parBunga / 100;
    }
    
    private int hitungSaldo(int parSaldo) {
        double jumlahBunga = hitungBunga(bunga) * parSaldo;
        parSaldo += jumlahBunga;   
        return parSaldo;
    }
    
    public void cetakHasil() {
        DecimalFormat kurs = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setCurrencySymbol("Rp. ");
        symbol.setGroupingSeparator('.');
        
        kurs.setDecimalFormatSymbols(symbol);
        
        int i = 1;
        while(saldo <= target) {
            saldo = hitungSaldo(saldo);
            System.out.printf("Saldo di bulan ke-%d %s %n", i, kurs.format(saldo).replaceAll(",00", ""));
            i++;
        }
    }
    
}
