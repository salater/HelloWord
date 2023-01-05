import javax.swing.text.FlowView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        //Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30,
        // tak długo, aż ich suma przekroczy 5000. Napisz dwie metody zwracające
        // największą i najmniejszą wylosowaną wartość.

        Random liczba = new Random();
        //List minMax = new ArrayList(100);
        int[] maxMin = new int[400];
        int liczbaLosowana;
        int suma = 0;
        int licznik=0;

        do {
            liczbaLosowana = liczba.nextInt(31);
            suma = suma + liczbaLosowana;
            System.out.println("Element losowania " + liczbaLosowana);

          //for(licznik = 0; licznik < 1000; licznik++){
              maxMin[licznik]=liczbaLosowana;
            licznik++;
              // }
            //System.out.println(liczbaLosowana); //wyswietlalosowane liczby
        }   while (suma < 5000) ;
        Arrays.sort(maxMin);
        for(int i = 0; i < 400; i++ ) {
            System.out.println("Element Tablicy " + maxMin[i]);
        }
            System.out.println(suma);
        System.out.println("stan licznika: " + licznik );
            System.out.println("Liczba min: " + maxMin[0]);
        System.out.println("Liczba max: " + maxMin[licznik]);


    }
}

/*   int limit = 5000;
        int[] numbers = new int[31];
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
        do {
            for (int i = 0; i < limit; i++)
                suma += numbers[i];

        }    while (suma > limit);
        System.out.println("Suma: " + suma);
        return;




            //for (int i = 0; i <= limit; i++) {
            //  suma =+ numbers[i];
            //System.out.println(suma);

        }

    }


//}
*/