//take a amtrix as input from the user. Search for a given number x & print the indices at which it occurs

import java.util.Scanner;

public class problem_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        // control rows
        for (int i = 0; i < rows; i++) {
            // control cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x is found at : (" + i + "," + j + ")");
                }
            }
            
        }

        sc.close();
    }
}