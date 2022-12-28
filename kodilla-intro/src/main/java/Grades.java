public class Grades {

    private int[] grades;
    private int size;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if(this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
     public void backLast() {
        if(this.size == 9){
            System.out.println(grades);
        }
        public void Srednia() {
            for(int i=0; i< grades.length; i++) {
                int suma =+ grades[i];
                double sredniaOcen = suma / size;
                System.out.println(sredniaOcen);
            }
         }

 }
}
