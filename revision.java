import java.util.Scanner;

public class revision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //i-p
        for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
            numbers[i][j] = sc.nextInt();
           } 
        }

        System.out.println("the x is : ");
        int x = sc.nextInt();

        //o-p
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