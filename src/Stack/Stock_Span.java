package Stack;

import java.util.Stack;

public class Stock_Span
{
    public static void main(String[] args)
    {
        int arr[] = {30,35,40,38,35};
        CalSpan(arr);
    }

    private static void CalSpan(int[] arr)
    {
        java.util.Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++)
        {
            while(!st.isEmpty() && arr[i] > arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans[i] = i+1;
            }
            else
            {
                ans[i] = i-st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i]+" ");

        }
        System.out.println("END");
    }
}
