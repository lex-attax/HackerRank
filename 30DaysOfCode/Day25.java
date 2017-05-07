package solution;

import java.util.Scanner;

/**
 * Created by Alex on 07.05.2017.
 */
public class Day25 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int total = scanner.nextInt();
    int next = 0;
    boolean isPrime = true;

        for (int i=0; i<total; i++){
        next = scanner.nextInt();

        if (next <= 1) {
            System.out.println("Not prime");
        } else {
            isPrime = true;

            for (int j=2; j * j <=next ; j++){
                if (next%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
        scanner.close();
}
}








