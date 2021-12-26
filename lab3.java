/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zad3;
import java.util.Scanner;
/**
 *
 * @author damian
 */
public class lab3 {
    public static void main(String[] args) {
    
        //zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
     
    }
    
    public static void zadanie1(){
    
       int[] tablica = {2,4};
       
       int suma = 0;
       
    for (int i = 0; i <= 2; i++){ 
        suma += tablica[i];
    }   
    System.out.println("Suma: "+suma);
        
    }
     


public static void zadanie2(){
 
    int[] tab = {15,45,4};
    int dlugosc = tab.length;
    int max = tab[0];
    for (int i = 0; i < dlugosc; i++ ) {
    if (tab[i]> max)
    max = tab[i];

}
System.out.println("Maksymalny element tablicy wynosi:"+max);

}

public static void zadanie3(){
    
    String[] slowa = {"item nr1", "item nr2", "item nr3"};
    
    for (String slowo : slowa){
        System.out.println(slowo.toUpperCase() + " ");
    }
    
    
    
}



public static void zadanie4(){
    int[] zbior = new int[8];
    System.out.println("Podaj " + zbior.length + " liczb: ");
    
    for (int i = 0; i < zbior.length; i++){
        System.out.print((i + 1) + "zbior: ");
        zbior[i] = getInt[];
        
    }
    
    for (int i = 1; i < zbior.length; i++) {
        int aktualnaliczba = zbior[i];
        int j = i - 1;
        while (j >= 0 && zbior[j] > aktualnaliczba) {
            zbior[j + 1] = zbior[j];
            j--;
            
        }
        zbior[j + 1] = aktualnaliczba;
        
    }
    System.out.println("Posortowane liczby: ");
    
    for (int x : zbior) {
    System.out.print(x+ ",");
}
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    
}
    

