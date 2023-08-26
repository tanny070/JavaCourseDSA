package Recursion;

import java.util.*;
public class RatInCheese {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [] [] maze = new char [n] [m];
        for (int i = 0; i < maze.length; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }

        int [] [] ans = new int [n][m];
        path(maze,0,0,ans);
        if (flag==false) {
            System.out.println("NO Path found" );
        }


    }
    static boolean flag = false;
    public static void path(char [] [] maze,int cr ,int cc,int [] [] ans) {

        if (cr == maze.length-1 && cc == maze[0].length-1 && maze[cr][cc] != 'X') {
            ans[cr][cc] = 1;
            dispaly(ans);
            flag = true;
            return;

        }


        if (cr<0 || cr>= maze.length || cc<0 || cc>=maze[0].length || maze[cr] [cc] == 'X') {
            return;
        }
        maze[cr][cc] = 'X';
        ans [cr][cc] = 1;

        //First Way
        path(maze,cr-1,cc,ans);
        path(maze,cr+1,cc,ans);
        path(maze,cr,cc-1,ans);
        path(maze,cr,cc+1,ans);
        maze[cr][cc] = 'O';
        ans [cr][cc] = 0;
    }

    public static void dispaly(int[] [] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

}