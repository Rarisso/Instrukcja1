package Instrukcja1.firstapp;
import java.util.Scanner;


    public class Start {
        public static void main(String[] args) {

            Scanner zadanie = new Scanner(System.in);
            System.out.println("Witaj! Wybierz zadanie:");
            System.out.println("1. Kontrola temperatury");
            System.out.println("2. Sprawdzenie sekwencji");
            System.out.println("3. Trójkąt prostokątny");
            System.out.println("4. Wzór dla liczby wierszy");
            System.out.println("5. Połowa znaków");
            System.out.println("6. Tablica na odwrót");

            int number = zadanie.nextInt();

            if (number == 1) {
                System.out.println("ok");

                Scanner scan = new Scanner(System.in);
                System.out.println("Podaj pierwszą temperaturę");
                int firstTemp = scan.nextInt();
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Podaj drugą temperaturę");
                int secondTemp = scan2.nextInt();

                if (firstTemp > 101 && secondTemp > 101) {
                    System.out.println("Obie temperatury są za wysokie");
                } else if (firstTemp > 100) {
                    System.out.println("Pierwsza Temperatura jest za wysoka");
                } else if (secondTemp > 100) {
                    System.out.println("Druga Temperatura jest za wysoka");
                } else {
                    System.out.println("Wszystko jest ok");
                }

            } else if (number == 2) {

                Scanner tablica = new Scanner(System.in);
                System.out.println("Podaj mi 6 cyfr które Cię interesują");
                System.out.println("Pamiętaj żeby każdą cyfrę zatwierdzić 'Enterem'");

                int liczba1 = tablica.nextInt();
                int liczba2 = tablica.nextInt();
                int liczba3 = tablica.nextInt();
                int liczba4 = tablica.nextInt();
                int liczba5 = tablica.nextInt();
                int liczba6 = tablica.nextInt();

                if (liczba1 == 1) {
                    if (liczba2 == 2){
                        if (liczba3 == 3){
                            System.out.println("Sekwencja ta pojawia się w pierwszych trzech liczbach");
                        } else {
                            System.out.println("Nie ma tekiej sekwencji");
                        }
                    } else {
                        System.out.println("Nie ma tekiej sekwencji");
                    }

                } else if (liczba2 == 1) {
                    if (liczba3 == 2){
                        if (liczba4 == 3){
                            System.out.println("Sekwencja ta pojawia się w drugiej trzeciej i czwartej liczbie");
                        } else {
                        System.out.println("Nie ma tekiej sekwencji");
                    }
                } else {
                    System.out.println("Nie ma tekiej sekwencji");
                    }

                } else if (liczba3 == 1) {
                    if (liczba4 == 2){
                        if (liczba5 == 3){
                            System.out.println("Sekwencja ta pojawia się w trzeciej czwartej i piątej liczbie");
                        } else {
                        System.out.println("Nie ma tekiej sekwencji");
                    }
                } else {
                    System.out.println("Nie ma tekiej sekwencji");
                    }

                } else if (liczba4 == 1) {
                    if (liczba5 == 2) {
                        if (liczba6 == 3) {
                            System.out.println("Sekwencja ta pojawia się w czwartej piątej i szóstej liczbie");
                        } else {
                            System.out.println("Nie ma tekiej sekwencji");
                        }
                    } else {
                        System.out.println("Nie ma tekiej sekwencji");
                    }
                } else {
                    System.out.println("Nie ma tekiej sekwencji");
                }

            } else if (number == 3) {
                System.out.println("kontrola");

                    Scanner bok1 = new Scanner(System.in);
                    System.out.println("Podaj pierwszy bok");
                    int boka = bok1.nextInt();
                    Scanner bok2 = new Scanner(System.in);
                    System.out.println("Podaj drugi bok");
                    int bokb = bok2.nextInt();
                    Scanner bok3 = new Scanner(System.in);
                    System.out.println("Podaj trzeci bok");
                    int bokc = bok3.nextInt();

                    int kwadrata;
                    int kwadratb;
                    int kwadratc;

                    kwadrata = boka * boka;
                    kwadratb = bokb * bokb;
                    kwadratc = bokc * bokc;

                    if (kwadrata + kwadratb == kwadratc) {
                        System.out.println("To jest trójkąt prostokątny");
                    } else {
                        System.out.println("Nie jest to trójkąt prostokątny");
                    }

                } else if (number == 4) {
                    System.out.println("Ile pięter ma mieć wieża?");

                    Scanner liczba = new Scanner(System.in);

                    int pietro = liczba.nextInt();
                    for (int x = 0; x < pietro; x++) {
                    String gwiazdka = "";
                    for (int y = 0; y < x+1; y++)
                        gwiazdka += "*";
                    System.out.println(gwiazdka);
                    }

                } else if (number == 5){
                System.out.println("Podaj słowo");
                Scanner word = new Scanner(System.in);

                String word2 = word.nextLine();
                int half = word2.length()/2;
                System.out.println(word2.substring(0,half));


            } else if (number == 6){
                System.out.println("Odwrócimy kolejność! Jaka jest oryginalna?");
                Scanner tablica1 = new Scanner(System.in);
                Scanner tablica2 = new Scanner(System.in);
                Scanner tablica3 = new Scanner(System.in);
                Scanner tablica4 = new Scanner(System.in);
                Scanner tablica5 = new Scanner(System.in);
                Scanner tablica6 = new Scanner(System.in);

                int liczba1 = tablica1.nextInt();
                int liczba2 = tablica2.nextInt();
                int liczba3 = tablica3.nextInt();
                int liczba4 = tablica4.nextInt();
                int liczba5 = tablica5.nextInt();
                int liczba6 = tablica6.nextInt();

                int[] poprawnie = new int[]{liczba1, liczba2, liczba3, liczba4, liczba5,liczba6};
                int[] odwrotnie = new int[poprawnie.length];

                for (int i=0; i< poprawnie.length; i++)
                    System.out.print(poprawnie[i]+ " ");

                System.out.println();

                for (int a=0; a < poprawnie.length; a++) {
                    odwrotnie[a] = poprawnie[poprawnie.length - 1 - a];
                }
                System.out.println();

                for (int i=0; i < odwrotnie.length; i++)
                    System.out.print(odwrotnie[i] +" ");
            }

        }
}

