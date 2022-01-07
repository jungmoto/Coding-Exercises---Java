package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    if(isPalindrome(-1221) == true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if(isPalindrome(707) == true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if(isPalindrome(11212) == true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isPalindrome(int number){
        int temp = number;
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0){
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        if (temp == reverse){
            return true;
        } else {
            return false;
        }
    }
}
