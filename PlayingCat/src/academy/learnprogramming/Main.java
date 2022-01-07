package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        if (isCatPlaying(true,10) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (isCatPlaying(false,36) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (isCatPlaying(false,35) == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer == false) && (temperature >= 25) && (temperature <= 35)) {
            return true;
        } else if ((summer == true) && (temperature >= 25) && (temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }
}
