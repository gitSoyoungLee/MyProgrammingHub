import java.util.*;
import java.io.*;

public class Main {
    static char[][] answer1 = {
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        , {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        , {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        , {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        , {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        , {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        , {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        , {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

    static char[][] answer2 = {
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        , {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        , {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        , {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        , {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        , {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        , {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        , {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

    static int countMinDifference(char[][] board, int row, int col) {
        int count1 = 0;
        int count2 = 0;

        int answerRow = 0;
        int answerCol = 0;
        for(int i = row; i < row + 8; i++) {
            for(int j = col; j < col + 8; j++) {
                if(board[i][j] != answer1[answerRow][answerCol]) count1++;
                if(board[i][j] != answer2[answerRow][answerCol]) count2++;
                answerCol++;
            }
            answerRow++;
            answerCol = 0;
        }

        return Math.min(count1, count2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];

        for(int i=0; i<n; i++) {
            char[] str = br.readLine().toCharArray();
            for(int j=0; j<m; j++) {
                board[i][j] = str[j];
            }
        }



        int min = 64;

        for(int i=0; i<=n-8; i++) {
            for(int j=0; j<=m-8; j++) {
                int count = countMinDifference(board, i, j);
                min = Math.min(min, count);
            }
        }

        System.out.println(min);
    }
}