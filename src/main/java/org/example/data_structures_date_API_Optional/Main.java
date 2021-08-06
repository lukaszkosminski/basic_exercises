/*Zadanie A - 1 pkt
Dla tablicy wejściowej input zawierającej liczby typu int zwrócić tablicę zawierającą ilość elementów ujemnych oraz sumę elementów dodatnich.

Jeśli tablica będzie pusta lub null, wtedy należy zwrócić pustą tablicę.

Przykład:

Wejście: input int[] {-3, -2, -1, 0, 1, 2, 3, 4, 5}

Program powinien zwrócić: int[] {3, 15}, czyli 3 liczby ujemne i suma liczb dodatnich równa 15.


Zadanie B - 1 pkt
Dla tablicy wejściowej input zawierającej liczby typu int zwrócić mapę zawierającą:

ilość elementów ujemnych
ilość elementów dodatnich
ilość zer
sumę elementów ujemnych
sumę elementów dodatnich
Przykład:

Wejście: input int[] {-3, -2, -1, 0, 1, 2, 3, 4, 5}

Program powinien zwrócić: {number of negative numbers=3, number of positive numbers=5, number of zeros=1, sum of negative numbers=-6, sum of positive numbers=15}


Zadanie C - 1 pkt
Stwórz metodę, która przyjmuje parametr String (imię) i zwraca wartość logiczną true/false.

Metoda sprawdza, czy w danym parametrze (imieniu) powtarza się jakaś litera (ignoruj wielkość znaków):

jeśli tak, to zwraca true
jeśli nie, to zwraca false

Wypisz wynik w postaci imię – wynikMetody np.:

Adam, true
Jan, false

Metoda powinna wykorzystywać jedną z poznanych struktur danych:

Tablica/Lista/Set/Mapa - wybierz najlepszą do tego celu

Zadanie D - 1 pkt
Napisz metodę, która wyświetli informację, ile czasu pozostało do końca kursu (czyli do 11 kwietnia 2021 14:00).

Np.:

Do końca kursu: 143 dni 15 godzin 20 minut.

Metoda powinna wykorzystywać Date API (JSR-310).


Zadanie E - 1 pkt
Napisz metodę, która przyjmuje parametr String (imię) i wyświetla na konsoli informację, jaką ocenę uzyskał kursant za zadanie domowe.

Na potrzeby zadania utwórz kodzie dowolną strukturę danych zawierającą niezbędne informacje (kursant + ocena).

Wejście: Karol

Program powinien wyświetlić:

Karol za zadanie domowe uzyskał 5 pkt. (jeśli Karol oddał pracę domową)

Karol nie wykonał jeszcze zadania domowego (jeśli Karol nie oddał jeszcze pracy domowej; ocena = null)

Nie znaleziono kursanta o imieniu "Artur" (jeśli kursant o podanym imieniu nie istnieje)

Metoda powinna wykorzystywać Java 8 Optional.

 */

package org.example.data_structures_date_API_Optional;

public class Main {
    public static void main(String[] args) {

        int[] input = {-3, -2, -1, 0, 1, 2, 3, 4, 5};
        //Zadanie A
        System.out.println("{number of positive numbers=" + zadanieA(input)[0] + " , " + "sum of positive numbers=" + zadanieA(input)[1] + "}");
        //Zadanie B
        System.out.println(zadanieB(input));
    }

    public static int[] zadanieA(int[] input) {
        int[] Tab = new int[2];
        int sumaDodatnich = 0;
        int iloscUjemnych = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 0) {
                sumaDodatnich = sumaDodatnich + input[i];
            } else {
                iloscUjemnych++;
            }

            Tab[0] = sumaDodatnich;
            Tab[1] = iloscUjemnych;
        }
        return Tab;
    }

    public static String zadanieB(int[] input) {

        int iloscElementowujemnych = 0;
        int iloscElementowDodatnich = 0;
        int iloscZer = 0;
        int sumaElementowUjemnych = 0;
        int sumaElementowdodatnich = 0;


        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {

                iloscElementowDodatnich++;
                sumaElementowdodatnich = input[i] + sumaElementowdodatnich;
            }
            if (input[i] < 0) {

                iloscElementowujemnych++;
                sumaElementowUjemnych = input[i] + sumaElementowUjemnych;
            }
            if (input[i] == 0) {
                iloscZer++;

            }

        }
        return "{number of negative numbers=" + iloscElementowDodatnich + " " +
                ", number of positive numbers=" + iloscElementowujemnych + " " +
                ", number of zeros=" + iloscZer + " " +
                ", sum of negative numbers=" + sumaElementowUjemnych + " " +
                ", sum of positive numbers=" + sumaElementowdodatnich + "}";
    }

}