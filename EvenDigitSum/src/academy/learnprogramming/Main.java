package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234));
    }

    public static int getEvenDigitSum(int number) {
        int evenSum = 0;

        if (number >= 0) {

            while (number != 0) {
                int lastDigit = number % 10;

                if (lastDigit % 2 == 0) {
                    evenSum += lastDigit;
                }
                number /= 10;
            }
            return evenSum;
        }
        return -1;
    }
}

