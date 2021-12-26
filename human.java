/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damian
 */

public class human{
    int wiek;
    int waga;
    int wzrost;
    String imie;
    String plec="k";

    public human( int wiek, int waga, int wzrost, String imie, String plec){
        this.wiek=wiek;
        this.waga=waga;
        this.wzrost=wzrost;
        this.imie=imie;
        this.plec=plec;

    }


    public int getGetAge() {
        return wiek;
    }

    public int getGetweight() {
        return waga;
    }

    public int getHeight() {
        return wzrost;
    }
    public String getname(){
        return imie;
    }
    public boolean isMale(){
        if("k".equals(plec)){
            return true;
        }
        else{
            return false;
        }
    }
}