package com.michal;

//Napisz testy oraz metodę, która przyjmuje jako argument tablicę liczb oraz liczbę i zwraca indeks w tej tablicy, pod którym znajduje się liczba podana jako drugi argument. Jeżeli podanej liczby nie ma w tablicy, metoda powinna zwrócić liczbę -1. Przykłady:
//
//        Dla argumentów { 1, 10, 200, 1000 }, 200 – metoda powinna zwrócić 2, ponieważ liczba 200 jest trzecim elementem podanej tablicy, a jej indeks to 2 (bo, jak na pewno pamiętamy, indeksy zaczynamy liczyć od 0).
//        Dla argumentów { 1, 10, 200, 1000 }, 500 – metoda powinna zwrócić -1, ponieważ liczby 500 nie ma w podanej tablicy.
//        Podczas testowania tej metody, warto sprawdzić wiele różnych przypadków:
//
//        Jak zachowa się metoda, gdy przesłana do niej tablica będzie pusta?
//        Jak zachowa się metoda, gdy szukana liczba będzie pierwszym elementem tablicy, a jak, gdy będzie ostatnim elementem? (dwa przypadki testowe)
//        Jak zachowa się metoda, gdy przesłana tablica nie będzie pusta, ale nie będzie w niej szukanego elementu?
//        Czy metoda zadziała poprawnie, gdy szukana liczba będzie znajdowała się gdzieś w środku tablicy?
//        Czy metoda zwróci poprawnie pierwszy indeks szukanego elementu, jeżeli szukana liczba będzie występować więcej niż raz w tablicy?
//        Zgodnie z powyższym, będziemy mieli sześć metod testowych – oto przykładowe rozwiązanie tego zadania:

public class ZwracaSzukanyIndeksZTablicy {

    public static void main(String[] args) {

        indeksElementu_ElementNa_Koncu_zwrocIndeksKoncowy();
        indeksElementu_elementNaPoczatku_zwrocIndeksZero();
        indeksElementu_pustaTablica_zwrocicMinusJeden();
        indeksElementu_wieleRazyTenSamElement();
        indeksElementu_elementWSrodku_zwrocIndeksElementu();
    }

    public static int indeksElementu(int[] tab, int szukanaLiczba) {

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == szukanaLiczba) {
                return i;
            }
        }
        return -1;
    }

    public static void indeksElementu_pustaTablica_zwrocicMinusJeden(){
        // given
        int[] tablica = {};
        int szukanaLiczba = 5;

        // when
        int indeksLiczby = indeksElementu(tablica,szukanaLiczba);

        // then
        assertEquals(-1,indeksLiczby);
    }

    public static void indeksElementu_elementNaPoczatku_zwrocIndeksZero(){
        // given
        int[] tablica = {10,2,3,4,5};
        int szukanaLiczba = 10;

        // when
        int indeksLiczby = indeksElementu(tablica,szukanaLiczba);

        // then
        assertEquals(0, indeksLiczby);
    }

    public static void indeksElementu_ElementNa_Koncu_zwrocIndeksKoncowy(){
        // given
        int[] tablica = {10,2,3,4,5};
        int szukanaLiczba = 5;

        // when
        int indeksliczby = indeksElementu(tablica, szukanaLiczba);

        // then
        assertEquals(tablica.length-1,indeksliczby);
    }

    public static void indeksElementu_elementWSrodku_zwrocIndeksElementu(){

        // given
        int[] tablica = {10,2,3,4,5};
        int szukanaLiczba = 3;

        // when
        int indeksliczby = indeksElementu(tablica, szukanaLiczba);

        // then
        assertEquals(2,indeksliczby);
    }

    public static void indeksElementu_wieleRazyTenSamElement(){

        // given
        int[] tablica = {10,2,3,2,5};
        int szukanaLiczba = 2;

        // when
        int indeksLiczby = indeksElementu(tablica,szukanaLiczba);

        // then
        assertEquals(1,indeksLiczby);
    }

    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {

            System.out.println("Spodziewano sie liczby " + actual +
                    ", ale otrzymano: " + expected);
        }
    }
}


