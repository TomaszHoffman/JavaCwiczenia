package cwiczeniaJava;

//Stworz 3 obiekty klasy student. Przypisz wartości do pól. Stwórz tablice i dodaj studentów do tablicy.
// przejdź przez studentów tablicy i wywoałaj wszystkie  4 metody.
public class StudentChecker {
    public static void main(String[] args) {

        Student tomasz = new Student();
        tomasz.imie = "Tomasz";
        tomasz.nazwisko = "Tomaszewski";
        tomasz.nick = "Tomasso";
        tomasz.nrIndeksu = 1023;

        Student andrzej = new Student();
        andrzej.imie = "Andrzej";
        andrzej.nazwisko = "Andrzejewski";
        andrzej.nick = "Andzej";
        andrzej.nrIndeksu = 1022;

        Student mariola = new Student();
        mariola.imie = "Mariola";
        mariola.nazwisko = "Mariolowska";
        mariola.nick = "Mariolla";
        mariola.nrIndeksu = 1021;

        Student[] studenty = new Student[3];
        studenty[0] = tomasz;
        studenty[1] = andrzej;
        studenty[2] = mariola;

        for (int i = 0; i < studenty.length; i++) {
            studenty[i].PrzedstawSie();
            studenty[i].PodajNick();
            studenty[i].podajNrIndeksu();
        }
    }
}
