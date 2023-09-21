package cwiczeniaJava;

public class SymulacjaPromocji {
    public static void main(String[] args) {


        //Obliczenie zwiększenia przychodów gdy klient zarekomneduje nowego klienta -
        //otrzyma przy tym 10% znizki na usluge lekcji muzyki. Oblicz ile zwiekszy sie przychod w zaleznosci od
        // liczby zarekomendowanych.
        //ile zyska klient ktory rekomenduje gdzie maksymalnie moze zarekomendowac 5 klientow

        //Liczba klientów objętych promocja
        int liczbaKlientow = 20;
        //Cena lekcji przed promocja
        double cenaLekcji = 100;
        //wysokość zniżki
        double wysokoscZnizki = 10;

        //Przychód bez promocji
        double przychodBezPromocji = liczbaKlientow * cenaLekcji;

        //Przychód z promocji
        int przychodZPromocji = 0;
        for (int i = 1; i <= 5; i++) {
            //Oblicz ile klient zyska
            double zarobekKlienta = i * (cenaLekcji * (1 - wysokoscZnizki / 100));
            //Wyświetl wynik
            System.out.println("Cena lekcji po promocji " + zarobekKlienta);
            //Dodaj do przychodu z promocji
            przychodZPromocji += zarobekKlienta;
        }

        //Wyświetlenie wyników
        System.out.println("Przychód bez promocji: " + przychodBezPromocji);
        System.out.println("Przychód z promocji: " + przychodZPromocji);

    }

}