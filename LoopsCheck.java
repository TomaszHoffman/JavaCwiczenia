package cwiczeniaJava;
public class LoopsCheck {
    public static void main(String[] args) {

        //Wypisz liczby z zakresu 1-100 podzielne przez 3

        for (int i=1; i<100; i++) {
            if (i % 3 == 0) {
                System.out.println("Jestem podzielna przez 3 :" + i);
            }


        }

        //odwroc elemnty tablicy[1,3,5] -> [5,3,1]


        int [] tablica = new int[] {1,3,5};
        int[] arr = new int[tablica.length];


        for (int i=0; i<tablica.length; i++)
            System.out.print(tablica[i] + "  ");
            System.out.println();


            for(int i= 0; i< tablica.length; i++)
                arr[i]=tablica[tablica.length - 1 - i];

        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "  ");
        System.out.println();

    }

}