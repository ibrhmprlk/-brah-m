/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oophafta9;

/**
 *
 * @author user
 */
public class Personel {

    String ad;
    String soyad;

    public Personel(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public Personel() {
        this.ad="Haydar";
        this.soyad="Devrim";
    }
    
    public void PersonelKarti(){
        System.out.println(this.ad+" "+this.soyad);
    }
    

}
