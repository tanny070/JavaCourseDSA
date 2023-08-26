package Recursion;

public class Combination
{
        public static void main(String[] args) {
            int n = 4;
            int tq = 2;
            boolean[] board = new boolean[n];
            Combination_(board, tq, "", 0, 0);
        }

        public static void Combination_(boolean[] board, int tq, String ans, int qpsf, int idx) // qpsf= queen placed so far
        {
            if (qpsf == tq) {
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < board.length; i++) {
                if (!board[i]) {
                    board[i] = true;
                    Combination_(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1, i + 1);
                    // now doing backtracking
                    board[i] = false;
                }

            }

        }
}


