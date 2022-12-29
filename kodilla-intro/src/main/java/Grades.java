// stworzyc tablice ocen ucznia w ilosci 10
// podac ostatnio dodaną ocene
// wyliczyc srednia artymetyczna ocen ucznia

public class Grades {
    private int[] grades;
    private int size;
    private int value;
    int suma;


    public Grades() {
        this.grades = new int[9]; //{4, 5, 1, 3, 5, 4, 4, 6, 3, 2};       //tablica ocen o dlugosci 10 czyli od 0-9
        this.size = 0;
    }

      public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void lastValue() {
        System.out.println("Otatnia ocena to: " + this.grades[9]);
    }

    public void srednia() {
        for (int i = 0; i < size; i++) {
            suma = suma + this.grades[i];
        }
        int srednia = suma / size;
        System.out.println("Średnia ocen ucznia to: " + srednia);

    }
}
                                                     // this.stopien = grades[9];                     // ostatnia ocena
                                                     //this.ileOcen = grades.length;
/*
}

      public obliczSume(int suma) {
            for (int i = 0; i < ileOcen; i++) {                // suma ocen
                this.suma = this.suma + ocena[i];
            }
            System.out.println("suma ocen: " + suma);
        }
        public static void wyliczSredia() {
            srednia = suma / ileOcen;                       // srednia ocen
            System.out.println("srednia ocena ucznia: " + srednia);
        }
}
*/

//zadanie bez zastosowania obiektowego - działa
/*
public class Grades {
    public static void main(String[] args) {
    double suma = 0;
    int stopien;
    double srednia;


    int[] ocena = {4, 5, 1, 3, 5, 4, 4, 6, 3, 2};       //tablica ocen o dlugosci 10 czyli od 0-9
    stopien =ocena[9];                                    // ostatnia ocena
        System.out.println("ilosc ocen to: "+ocena.length);
        System.out.println("ostatnia ocena: "+stopien);



        for (int i = 0; i < ocena.length; i++) {                // suma ocen
            suma = suma + ocena[i];
        }
        System.out.println("suma ocen: " + suma);

        srednia = suma / ocena.length;                       // srednia ocen
        System.out.println("srednia ocena ucznia: " + srednia);
    }
}
*/




       /*
public class Grades {

    public static void main(String[] args) {


        int[] cyfry = new int[10];
        int ileOcen = 0;
        double suma = 0.0;
        double srednia = 0.0;
        for (int i = 0; i < cyfry.length; i++) {
            cyfry[i] = ileOcen++;
            System.out.print(cyfry[i] + ",");
        }
        System.out.println();
        System.out.println("ilość ocen: " + ileOcen);
      
        for(int i=0; i < cyfry.length; i++) {
        suma += cyfry[i];}
        System.out.println("Suma ocen: "+ suma);

        srednia = suma/ileOcen;
            System.out.println("Średnia ocena to: " + srednia);
        }
    }
   */

/* public class Grades {

    public static void main(String[] args) {


        int[][] cyfry = new int[10][10];
        int licznik = 0;
        for (int i = 0; i < cyfry.length; i++) {
            for (int j = 0; j < cyfry[i].length; j++) {
                cyfry[i][j] = licznik++;
                if (licznik <= 10) {
                    System.out.print("0" + cyfry[i][j] + ",");
                } else {
                    System.out.print(cyfry[i][j] + ",");

                    if(licznik > 10 && (licznik+1)%10==0) {
                        System.out.println();
                    }
                }
            }

        }
    }
} */
/*
public class Grades {

    public static void main(String[] args) {

        double[] ocenyUczniow = {5, 7, 4};
        double suma = 0.0;
        int iloscOcenUczniow = ocenyUczniow.length;

        for (int i = 0; i < ocenyUczniow.length; i++) {
            suma += ocenyUczniow[i];
        }

        // dzielimy zsumowaną tablicę przez ilość ocen uczniów w tablicy
        double sredniaOcenUczniow = suma / iloscOcenUczniow;

        System.out.println(sredniaOcenUczniow); // 4.0
    }
} */