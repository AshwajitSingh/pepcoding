import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for(int i = 1; i <= n; i++){ // rows
        // single row - ith rows mei i stars
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }

        System.out.println();
    }
  }
}