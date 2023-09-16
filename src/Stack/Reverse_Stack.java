package Stack;

import java.beans.Introspector;
import java.util.Scanner;

public class Reverse_Stack
{
    public static void main(String[] args) throws Exception
    {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("before reverse");
        st.display();
        Reverse(st);
        System.out.println();
        System.out.println("after reverse");
        st.display();

    }

    public static void Reverse(Stack<Integer> st) throws Exception
    {
        if(st.isEmpty())
        {
            return;
        }
        int x=st.pop();
        Reverse(st);
        Bottom_Insert(st,x);

    }

    public static void Bottom_Insert(Stack<Integer> st, int val) throws Exception
    {
        if(st.size()==0) {
            st.push(val);
            return;
        }
        int top = st.pop();
        Bottom_Insert(st, val);
        st.push(top);
    }
}
