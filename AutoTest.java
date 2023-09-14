package cwiczeniaJava;

public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes","klasa S",2023,1200);


        //mercedes.jedz();
        //mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto("Audi","Audi a5",2022,1222);




        //audi.hamuj();
        audi.info();

        Auto noName = new Auto();

        //noName.jedz();
        //noName.hamuj();
        noName.info();

        //Auto auto = new Auto();

    }
}
