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
public class SepedaBeraksi {
    public static void main(String [] args){
        //membuat object dari class sepeda
        Sepeda Sepedaku = new Sepeda ("Hitam","poligon",5);
        System.out.println("Warna Sepeda : "+Sepedaku.tampilkanWarna());
        System.out.println("Merek Sepeda : "+Sepedaku.tampilkanMerek());
        System.out.println ("Keceptan Awal : "+Sepedaku.tampilkanKecepatan());
        Sepedaku.tambahKecepatan(4);
        Sepedaku.kurangkecepatan(5);
    }
}