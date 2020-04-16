package com.rock.automation;

public class Main {
    public static int silnia(int liczba) {
        int rezultat = 1;
        for(int i=1;i<=liczba;i++)
        {
            rezultat = rezultat * i;
        }
        System.out.println(rezultat);
        return rezultat;
    }

    public static int silniaR(int liczba) {
        int rezultat;
        if(liczba==0) rezultat=1;
        else rezultat = silniaR(liczba-1) * liczba;
        System.out.println(rezultat);
        return rezultat;
    }

    public static void main(String[] args) {
//        MyName myName = new MyName("frsit", "last");
        silniaR(3);
    }
}
