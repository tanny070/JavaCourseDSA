package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_2D_List
{
    public static void main(String[] args)
    {
        int[] coin={2,3,5};
        int amount=8;
        List<Integer> ll =new ArrayList<>();
        List<List<Integer>> ans =new ArrayList<>();
        Combination(coin,amount,ll,0,ans);
        System.out.println(ans);

    }

    public static void Combination(int[] coin, int amount, List<Integer> ll, int idx,List<List<Integer>> ans)
    {
        if(amount == 0)
        {
            ans.add(new ArrayList<>(ll));
            //System.out.println(ll+" ");
            return;
        }

        for (int i = idx; i < coin.length; i++)
        {
            if(amount >= coin[i])
            {
                ll.add(coin[i]);
                Combination(coin,amount-coin[i],ll,i,ans);
                ll.remove(ll.size()-1);
            }

        }
    }
}
