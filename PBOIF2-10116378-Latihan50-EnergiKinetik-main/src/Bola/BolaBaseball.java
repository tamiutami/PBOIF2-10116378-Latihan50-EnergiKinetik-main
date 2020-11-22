/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bola;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi Program : Menghitung Energi Kinetik dan Usaha dalam suatu bola
 */
public class BolaBaseball {
    private final double massa;
    private final double kecepatan;
    
    public BolaBaseball (double massa, double kecepatan){
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    private double getEnergiKinetik(){
        // massa harus dalam satuan KG
        // kecepatan dalam satuan m/s
        // return EK dalam satuaan Joule
        return  (massa * Math.pow(kecepatan,2)) / 2;
    }
    
    private double getUsaha(double kecepatanAwal){
        // rumus W (usaha) deltaEk
                
        return (massa * (Math.pow(kecepatan,2) - Math.pow(kecepatanAwal,2))) / 2;
    }
    
    public void tampil(){   
        System.out.printf("Sebuah bola baseball dengan massa %.3f kg dilempar dengan kecepatan %.2f m/s\n",massa,kecepatan);
        System.out.printf("Energi Kenetik yang Dihasilkan = %.2f Joule \n",getEnergiKinetik());
        System.out.printf("Usaha yang didapatkan = %.2f Joule \n",getUsaha(0));
    }
}
