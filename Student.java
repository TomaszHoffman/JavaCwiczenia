package cwiczeniaJava;

public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public int nrIndeksu;

    public void PrzedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void PodajNick() {
        System.out.println("Mój nick to :" + nick);
    }

    public void podajNrIndeksu() {
        System.out.println("Mój numer indeksu to : " + nrIndeksu);

    }

    public void info() {
        System.out.println("imie " + imie + nazwisko);
        System.out.println("nick: " + nick);
        System.out.println("numer indeksu " + nrIndeksu);
    }

}
