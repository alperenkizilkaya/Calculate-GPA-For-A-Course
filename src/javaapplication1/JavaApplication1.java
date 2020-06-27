/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alperenkizilkaya
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        System.out.println("lütfen vize notunuzu giriniz");
        Scanner s = new Scanner(System.in);
        float vize = s.nextFloat();
        
        System.out.println("lütfen final notunuzu giriniz");
        float fnl = s.nextFloat();

        vize = vize*40/100;
        fnl = fnl*60/100;
        
        System.out.println("yıl sonu ders ortalaması " + (vize+fnl));
    }
    
}
