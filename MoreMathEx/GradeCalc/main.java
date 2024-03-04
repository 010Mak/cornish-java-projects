public class Main {
    public static void main(String[] args) {
        double sumTestScores = 89 + 67 + 78 + 91 + 85;
        double sumHwScores = 12 + 19 + 15 + 17 + 20;
        double sumClassworkScores = 88 + 80;

        double testAverage = sumTestScores / 5;
        double hwAverage = sumHwScores / 5;
        double classworkAverage = sumClassworkScores / 2;

        double courseGrade = testAverage * 0.75 + hwAverage * 0.15 + classworkAverage * 0.10;
        System.out.println("Course Grade is: " + courseGrade);
    }
}