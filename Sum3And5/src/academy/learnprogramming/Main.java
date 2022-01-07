package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        for (int i=1; i<=1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if (counter == 5){
                break;
            }
        }

        System.out.println("Sum = " + sum);

        System.out.println("\n");

        sum = 0;
        counter = 0;

        for (int i=1; i<=1000; i++){
            if ((i % 2 == 0) && (i % 10 ==0)){
                counter++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if (counter == 5){
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
