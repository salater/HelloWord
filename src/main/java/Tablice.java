import java.util.Scanner;

public class Tablice{
    public static void main(String[] args){
        int[] tablica;
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj ilość elementów: ");
        int liczbaElementow = odczyt.nextInt();
        tablica = new int[liczbaElementow];

        for(int i=0; i<tablica.length; i++)
            tablica[i] = i+1;

        int licznik=0;
        while(licznik<tablica.length){
            System.out.print(tablica[licznik]+" ");
            licznik++;
        }
    }
}