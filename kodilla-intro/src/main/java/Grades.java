// stworzyc tablice ocen ucznia w ilosci 10
//stworzyc metode przekazaującą w argumence ocenę do tablicy
// podac ostatnio dodaną ocene
// wyliczyc srednia artymetyczna ocen ucznia

public class Grades {
    int[] grades;
   // private int[] grades;
   int size;
    // int suma;
    int srednia;
    //int value;
    int suma;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {                 // sprwdzam czy rozmiar jest 10 jak tak to koniec dodawania
            return;
        }
            this.grades[this.size] = value;          //value przyjmuje wartosc zmiennej tablicowej grades z pozycji
                                                      // [this.size] (nadal nie wim czym uzupelmnia tablice ile jest value ??)
            this.size++;                             //zmiekszam rozwmiar czyli kolejna komorka tablicy
            System.out.println("to jest value w tablicy: " + grades[this.size]);
        }
    }
/*
    public void add(int value) {               //wywoluję metodę dodania oceny i zwracam ją w argumencie
                                               // metody i przekazuje jądo klasy
        if (this.size == 10) {                 // sprwdzam czy rozmiar jest 10 jak tak to koniec dodawania
            return;
        }
        this.grades[this.size] = value;          //value przyjmuje wartosc zmiennej tablicowej grades z pozycji
                                                 // [this.size] (nadal nie wim czym uzupelmnia tablice ile jest value ??)
        this.size++;                             //zmiekszam rozwmiar czyli kolejna komorka tablicy
        System.out.println(this.grades[this.size]);
    }    */

    //public void checkLast() {
    //   int lastValue = this.grades[size];
    //    System.out.println("Otatnia ocena to: " + this.lastValue);
    //}

  /*  public void wyliczSrednia() {
        for (int i = 0; i < size; i++) {
            //  this.suma = this.suma + this.grades[i];
             suma = suma + value;
            System.out.println("suma liczona " + suma);
        }
        //srednia = this.suma / size;
        srednia = suma / size;
        System.out.println("Średnia ocen ucznia to: " + srednia);
    }  */

  //  public void podajValue() {

    //    Scanner scanner = new Scanner(System.in);

      //  for(int i=0; i<10; i++ ) {
        //    System.out.println("Podaj kolejną ocenę: ");
          //  this.value = scanner.nextInt();








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
*/   // obliczSume


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



*/    //zadanie bez zastosowania obiektowego - działa

/*
public class Grades {

    public static void main(String[] args) {


        int[] cyfry = new int[10];
        int ileOcen = 0;
        double suma = 0.0;
        double srednia = 0.0;
        for (int i = 0; i < cyfry.length; i++) {  //wypelnianie tablicy liczbami o 0-9
            cyfry[i] = ileOcen++;
            System.out.print(cyfry[i] + ",");
        }
        System.out.println();
        System.out.println("ilość ocen: " + ileOcen);
      
        for(int i=0; i < cyfry.length; i++) {
        suma += cyfry[i];
        }
        System.out.println("Suma ocen: "+ suma);

        srednia = suma/ileOcen;
            System.out.println("Średnia ocena to: " + srednia);
        }
    }

 */  //też działa podobnie jak wyżej w jednej klasie


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
} */  // próba tablicy dwu wymiarowej
