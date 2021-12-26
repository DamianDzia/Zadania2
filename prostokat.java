/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prostokat;

import static java.lang.Math.sqrt;

/**
 *
 * @author damian
 */
public class prostokat {
    double wys;
    double szer;
   public prostokat (double szer,double wys){
       this.szer=szer;
       this.wys=wys; 
   } 
   public double getpole(){
       return wys*szer;
   }
   public double getobw(){
       return (2*wys)+(2*szer);
   }
   public double getprzek(double b){
       b=(wys*wys)+(szer*szer);
    return sqrt(b); 
   }

    
    
    
    
}
