package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();

        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++)
                arr[i] = scn.nextInt();

            nextLarger(arr);

            t--;
        }
    }

    private static void nextLarger(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++)
        {
            while(!st.isEmpty() && arr[i] > arr[st.peek()])
            {
                ans[st.pop()] = arr[i];
            }
            st.push(i);

        }

        while(!st.isEmpty())
        {
            ans[st.pop()] = -1;
        }

        for (int i = 0; i < ans.length; i++)
        {
            System.out.println(arr[i]+" "+ans[i]);

        }
    }
}
