package Stack;

import java.util.Stack;

public class Smallest_Number_From_DI
{
    public static void main(String[] args)
    {
        String str="IIIDIDDD";
        String ans=Smallest_Number(str);
        System.out.println(ans);



    }

    public static String Smallest_Number(String str)
    {
        Stack<Integer> st = new Stack<Integer>();
        int[] ans = new int[str.length()+1];
        int count=1;
        for (int i = 0; i <= str.length() ; i++)
        {
            if(i == str.length() || str.charAt(i) == 'I')
            {
                ans[i] = count;
                count++;
                while (!st.isEmpty())
                {
                    ans[st.pop()] = count;
                    count++;
                }
            }
            else
            {
                st.push(i);
            }

        }
        String s = "";
        for (int i = 0; i < ans.length; i++)
        {
            s = s + ans[i];

        }
        return s;

    }
}
