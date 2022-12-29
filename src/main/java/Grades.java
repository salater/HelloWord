public class Grades {
    public int sum(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        int[] numbers = {3, 4};
        System.out.println(grades.sum(numbers));
    }
}
