/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.oophafta9;

/**
 *
 * @author user
 */
public class OopHafta9 {

    public static void main(String[] args) {
        Bisiklet bisiklet = new Bisiklet();
        bisiklet.ilerle(5);
       
        System.out.print("Bisikletin " + bisiklet.getTekerlekSayisi()
                + " tekerleği var.");
    }
}
