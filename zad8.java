package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe przedzialu");
        int a = scan.nextInt();
        System.out.println("Podaj ostatnia liczbe przedzialu");
        int b = scan.nextInt();

        int c = rand.nextInt(b - a + 1) + a;
       // System.out.println(c);
        int d = rand.nextInt(b - a + 1) + a;
       // System.out.println(d);
        int e = rand.nextInt(b - a + 1) + a;
       // System.out.println(e);
        System.out.println(+c + d + e);
        System.out.println(troj(c,d,e));

    }
    public static boolean troj(int c,int d , int e){
        if (c*c+d*d==e*e) {
            System.out.println("trojkat mozna zbudowac");
            return true;
        } else {
            System.out.println("trojkata nie mozna zbudowac");
            return false;
        }

    }



}
