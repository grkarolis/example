package code.examples;

public class StepFour {

    public static void main(String[] args) {
        int mySum;
        mySum = calculateSum(4, 85);
        System.out.println(mySum);

        double myDoubleSum;
        myDoubleSum = calculateSum(10d, 15d);
        System.out.println(myDoubleSum);

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(score, levelCompleted, bonus);

        int newScore = calculateScore("Karolis", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {

        int finalScore = score + (levelCompleted * bonus);
        finalScore += 2000;
        System.out.println("Your final score was " + finalScore);
        return finalScore;

    }

    static void packagePrivateMethod() {
        System.out.println("Hello from Package Private method in StepFour class!");
    }
    private static void privateMethod() {
        System.out.println("Hello from Private method in StepFour class!");
    }

    public static void publicMethod() {
        System.out.println("Hello from Public method in StepFour class!");
    }

    private static double calculateSum(double a, double b) {
        return a + b;
    }

    private static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
