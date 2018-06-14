package my;

public class RoundedGrades {

    public static void main(String[] args) {

        int[] grades = {73, 67, 38, 33};

        int[] finalGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int remainder = grades[i] % 5;

            if (grades[i] < 38) {
                finalGrades[i] = grades[i];
                continue;
            }
            if (remainder > 2) {
                finalGrades[i] = ((grades[i] - remainder) + 5);
                continue;
            }

            if (remainder <= 2) {
                finalGrades[i] = grades[i];
                continue;
            }

        }

        for (int j = 0; j < finalGrades.length; j++)

        {
            System.out.println(finalGrades[j]);
        }
    }
}
