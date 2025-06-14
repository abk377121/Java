import java.util.Scanner;

public class nqueens {
    static int n = 0;
    static int[] ld = new int[30];
    static int[] rd = new int[30];
    static int[] cl = new int[30];

    static void printsolution(int board[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean solvenqutil(int board[][], int col) {
        if (col >= n) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (ld[i - col + n - 1] == 0 && rd[i + col] == 0 && cl[i] == 0) {
                board[i][col] = 1;
                ld[i - col + n - 1] = 1;
                rd[i + col] = 1;
                cl[i] = 1;

                if (solvenqutil(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0;
                ld[i - col + n - 1] = 0;
                rd[i + col] = 0;
                cl[i] = 0;
            }
        }

        return false;
    }

    static void solvenq(int n1) {
        n = n1;
        int board[][] = new int[n][n];

        if (solvenqutil(board, 0)) {
            printsolution(board);
        } else {
            System.out.println("Solution does not exist");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for the N-Queens problem:");
        int n1 = sc.nextInt();
        solvenq(n1);
        sc.close();
    }
}
