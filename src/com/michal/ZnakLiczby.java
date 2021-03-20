package com.michal;

public class ZnakLiczby {

        public static void main(String[] args) {

        sign_pierwszaUjemna_zwrocMinusJeden();
        sign_zero_zwrocZero();
        sign_pierwszaDodatnia_zwrocJeden();
        sign_liczbaUjemna_zwrocMinusJeden();
        sign_liczbaDodatnia_zwrocDodatnia();

    }

    public static int sign(int liczba){
        return liczba == 0 ? 0 : (liczba < 0 ? -1 : 1);
    }

    public static void sign_pierwszaUjemna_zwrocMinusJeden(){
        assertEquals(-1, sign(-1));
    }

    public static void sign_zero_zwrocZero(){
        assertEquals(0,sign(0));
    }

    public static void sign_pierwszaDodatnia_zwrocJeden(){
        assertEquals(1,sign(1));
    }

    public static void sign_liczbaUjemna_zwrocMinusJeden(){
        assertEquals(-1,sign(-100));
    }

    public static void sign_liczbaDodatnia_zwrocDodatnia(){
        assertEquals(1,100);
    }

    public static void assertEquals(int expected, int actual){
        if (expected != actual){
            System.out.println(" spodziewano sie liczby " + actual +
                    ", ale otrzymano: " + expected);
        }
    }
}
