public class RandomNumbers {

    public static void main(String[] args) {
        //Utwórz klasę RandomNumbers, w której będzie istnieć metoda losująca liczby z zakresu 0-30,
        // tak długo, aż ich suma przekroczy 5000. Napisz dwie metody zwracające
        // największą i najmniejszą wylosowaną wartość.

        int limit = 5000;
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
