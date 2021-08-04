/*
Napisz program, który pobiera na wejściu 2 liczby:

informację, z jakiego zakresu będzie losował dane (od 1 do podanej liczby)
ilość liczb do wylosowania
Wynikiem są wylosowane liczby (bez powtórzeń) i wyświetlone jedna pod drugą. Np.:

podaj zakres liczb: 49
podaj ilość liczb do wylosowania: 6
..losu..losu..losu..
4
11
2
35
31
23

zakresem w tym przypadku są liczby 1-49 i wylosowano 6 liczb.


Uwagi do rozwiązania:

dane wejściowe pobieraj z klawiatury,
program powinien być odporny na błędy (np. podanie tekstu zamiast liczby),
zadbaj, żeby w wyniku nie zdarzyły się powtórzenia,
kod napisz w osobnej klasie, tzn. w metodzie main() powinna być tylko jedna linia kodu: Lotto.start();
Za wykonanie powyższych poleceń można dostać maksymalną liczbę punktów.


Dodatkowe wymagania dla chętnych:

dodatkowo wyświetl wynik posortowany od najmniejszej do największej wartości,
wyświetlaj wyniki losowania, liczba po liczbie, z odstępem sekundy pomiędzy kolejnymi liczbami,
wynik losowania zapisz do pliku.

 */
package org.example.JavaSE.Ex2;

public class Main {
    public static void main(String[] args) {
        Lotto.start();
    }
}
