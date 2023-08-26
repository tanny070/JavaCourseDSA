package Array.Assignment3;

import java.util.Scanner;

public class MagicalPark
{
    public static void main(String[] args) {
        char[][] characters=new char[4][4];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<4;i++)
        {
            for(int j = 0; j < 4; j++) {
                characters[i][j] = sc.next().charAt(0);
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(characters[i][j] == '*')
                {
                    break;
                }
                System.out.print(characters[i][j]+" ");

            }
            System.out.println();
        }
    }
}
