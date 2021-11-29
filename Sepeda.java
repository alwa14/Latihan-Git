/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sepeda;

/**
 *
 * @author Adillah
 */
public class Sepeda {
    public String warna;
    public String merek;
    public int kecepatan;
    

    public Sepeda(String warna, String merek, int kecepatan) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatan = kecepatan;
    }
    
    public String tampilkanWarna(){
        return warna;
    }
    
    public String tampilkanMerek(){
        return merek;
    }
    
    public int tampilkanKecepatan(){
        return kecepatan;
    }
    
    //method 
    public void tambahKecepatan (int tambahkecepatan){
        kecepatan=kecepatan+tambahkecepatan;
        System.out.println("Kecepatan Saat ini : "+kecepatan+" km/jam");
        if(kecepatan>5){
            System.out.println("Sepeda Berjalan");
        }else{
            System.out.println("Sepeda Berhenti");
        }
    }
    public void kurangkecepatan (int kurangkecepatan){
        kecepatan=kecepatan-kurangkecepatan;
        System.out.println("Kecepatan Saat Ini : "+kecepatan+" km/jam");
        if(kecepatan<5){
            System.out.println("Sepeda Berhenti");
        }else{
            System.out.println("Sepeda Berjalana");
        }
    }
}  