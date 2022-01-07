package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit;
        int firstDigit = number;
        if (number >= 0) {
            lastDigit = number % 10;

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            return (lastDigit + firstDigit);
        } else {
            return -1;
        }
    }
}
