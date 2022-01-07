package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,6));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sum = (bigCount * 5) + smallCount;

        if (sum < goal) {
            return false;
        } else {
            int usedBigCount = goal / 5;
            if (((usedBigCount * 5) + smallCount) >= goal) {
                return true;
            }
        }
        return false;
    }
}
