package code.examples;

public class StepThree {

    public static void main(String[] args) {
        boolean isDangerous = false;
        if (isDangerous == true)
            System.out.println("Not really!");

        if (!isDangerous)
            System.out.println("Really dangerous!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        int playerScore = 500;
        if(playerScore >= 1000) {
            System.out.println("1st place in highscore table");
        } else if(playerScore >= 500 && playerScore < 1000) {
            System.out.println("2nd place in highscore table");
        } else if(playerScore >= 100 && playerScore < 500) {
            System.out.println("3rd place in highscore table");
        } else {
            System.out.println("4th place in highscore table");
        }

    }
}
