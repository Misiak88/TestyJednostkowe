package com.michal;

public class CzyParzysta {

        public static void main(String[] args) {

        czyParzysta_liczbaNieparzystaDodatnia_zwrocNieparzysta();;
        czyParzysta_liczbaNieparzystaUjemna_zwrocNieparzysta();
        czyParzysta_liczbaParzystaDodatnia_zwrociParzysta();
        czyParzysta_liczbaParzystaUjemna_zwrocicParzysta();
        czyParzysta_liczbaZero_zwrocParzysta();
    }

    public static boolean czyParzysta(int liczba){

        return liczba % 2 == 0;
    }

    public static void czyParzysta_liczbaParzystaDodatnia_zwrociParzysta(){
        assertEquals(true, czyParzysta(2));
    }

    public static void czyParzysta_liczbaParzystaUjemna_zwrocicParzysta(){
        assertEquals(true,czyParzysta(-2));
    }

    public static void czyParzysta_liczbaZero_zwrocParzysta(){
        assertEquals(true,czyParzysta(0));
    }

    public static void czyParzysta_liczbaNieparzystaDodatnia_zwrocNieparzysta(){
        assertEquals(false,czyParzysta(3));
    }

    public static void czyParzysta_liczbaNieparzystaUjemna_zwrocNieparzysta(){
        assertEquals(false,czyParzysta(-2));
    }

    public static void assertEquals(boolean expected, boolean actual){
        if (expected != actual){
            System.out.println("Spowiedziawno sie " + actual + ", ale otrzymano "+ expected);
        }
    }
}
