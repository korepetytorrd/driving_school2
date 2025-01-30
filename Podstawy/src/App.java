// Część I: Teoria (20 pkt)
// (4 pkt) Wyjaśnij, czym jest tablica w języku Java i podaj przykład jej deklaracji oraz inicjalizacji.
// (4 pkt) Wymień i krótko opisz trzy rodzaje pętli dostępne w języku Java.
// (4 pkt) Co to jest szyfrowanie? Podaj przykład zastosowania szyfrowania w praktyce.
// (4 pkt) Wyjaśnij, jak działa algorytm szyfrowania Cezara i jak można go zaimplementować w Javie.
// (4 pkt) Jakie są korzyści stosowania pętli w programach przetwarzających tablice?


// Część II: Zadania praktyczne (80 pkt)
// Tablice i pętle (20 pkt)
// Napisz program, który przyjmuje od użytkownika 10 liczb całkowitych, zapisuje je w tablicy, a następnie:

// Oblicza i wyświetla sumę wszystkich liczb.
// Wyświetla największą i najmniejszą liczbę z tablicy.


// Szukaj w tablicy (20 pkt)
// Napisz program, który:

// Generuje tablicę 20 losowych liczb z zakresu od 1 do 100.
// Pyta użytkownika o liczbę do znalezienia.
// Sprawdza, czy podana liczba znajduje się w tablicy i ile razy występuje. Wyświetla odpowiedni komunikat.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int [] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 liczb całkowitych: ");

        //uzupełnienie tablicy danymi
        int i =0 ;
        while (i<5) {
            int liczby = scanner.nextInt();
            numbers[i] = liczby;
            i++;
        }
        
        int liczbaMax=numbers[0] , liczbaMin = numbers[0], suma=0;


        for(int j = 0; j<numbers.length; j++){
            //suma = suma+numbers[j]; to samo tylko wiecej znaków
            suma += numbers[j];
            if (numbers[j] > liczbaMax) liczbaMax = numbers[j];
            if (numbers[j] < liczbaMin) liczbaMin = numbers[j];
        }
        System.out.println("Suma:" + suma + "\n" + "najwięszka liczba to:" + liczbaMax + "\n" + "najmnieszja liczba to:" + liczbaMin);

        //TODO wyświetl zawartość numbers w konsoli na dwa sposoby I w jednej linii II pionowo po enterach


        
        
    }
}
