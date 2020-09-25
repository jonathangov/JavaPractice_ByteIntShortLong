package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//    byte myByte = 1;
//    short myShort = 2;
//    int myInt = 3;
//    long myLong = 50000 + (10 * (myByte + myShort + myInt));
//    System.out.println("Sum of myLong is " +myLong);

        // Section 3.39 Challenge:
//        double myDouble1 = 20.00d;
//        double myDouble2 = 80.00d;
//        double results = (myDouble1 + myDouble2) * 100d;
//        System.out.println(results);
//
//        double remainder = results % 40.00d;
//        System.out.println(remainder);
//
//        boolean isZero = remainder == 0 ? true : false;
//        System.out.println(isZero);
//
//        if (!isZero) {
//            System.out.println("Got a remainder");
//        } else {
//            System.out.println("There is no remainder!");
//        }


        // Section 4.45 Challenge:

//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
//        boolean gameOver = true;
//
//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score is " + finalScore);
//        } else {
//            System.out.println("Game is not yet over!");
//        }

//        getGameScores(10000, 8, 200, true);
//        getGameScores(2000, 3, 200, false);

        // Section 4.48 Challenge:
        int rank;

        rank = calculateHighScore(1500);
        displayHighScorePosition("Jonathan", rank);

        rank = calculateHighScore(900);
        displayHighScorePosition("Han", rank);

        rank = calculateHighScore(400);
        displayHighScorePosition("Cam", rank);

        rank = calculateHighScore(100);
        displayHighScorePosition("Maggie", rank);

    }

        // Section 4.45 Challenge:
//    public static void getGameScores(int score, int levelCompleted, int bonus, boolean gameOver) {
//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score is " + finalScore);
//        } else {
//            System.out.println("Game is not yet over! Current score is " + score + ".");
//        }
//    }

        // Section 4.48 Challenge:



    public static void displayHighScorePosition(String playersName, int rank) {
        System.out.println(playersName + " is number " + rank + " on the score board!");
    }

    public static int calculateHighScore(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore > 100) {
            return 3;
        }

        return 4;
    }


}
