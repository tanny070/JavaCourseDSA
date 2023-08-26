package Recursion;

public class Board_Path
{
    public static void main(String[] args)
    {
        int n=7;

        System.out.println(BoardPath1(n,0,""));

    }

    public static int BoardPath(int end,int curr,String ans)
    {
        if(curr==end)
        {
            System.out.println(ans+" ");
            return 1;
        }
        if(curr>end)
        {
            return 0;
        }

        int fp=BoardPath(end, curr+1, ans + 1);
        int sp=BoardPath(end, curr+2, ans + 2);
        int tp=BoardPath(end, curr+3, ans + 3);

        return fp+sp+tp;

    }


    //Using loop

    public static int BoardPath1(int end,int curr,String ans)
    {
        if(curr==end)
        {
            System.out.println(ans+" ");
            return 1;
        }
        if(curr>end)
        {
            return 0;
        }

        int count=0;
        for(int dice=1;dice<=3;dice++)
        {
            count=count+BoardPath1(end,curr + dice,ans + dice);
        }


        return count;

    }
}
