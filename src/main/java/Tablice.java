public class Tablice {

    public static void main(String[] args) {


        int[][] cyfry = new int[10][10];
        int licznik = 0;
        for (int i = 0; i < cyfry.length; i++) {
            for (int j = 0; j < cyfry[i].length; j++) {
                cyfry[i][j] = licznik++;
                if (licznik < 10) {
                    System.out.print("0" + cyfry[i][j] + ",");
                } else {
                    System.out.print(cyfry[i][j] + ",");

                    for (licznik%10==0) {
                        System.out.println();
                    }
                }
            }

        }
    }
}