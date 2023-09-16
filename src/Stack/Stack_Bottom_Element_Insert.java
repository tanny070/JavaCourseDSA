package Stack;


import java.util.*;

public class Stack_Bottom_Element_Insert
{
    public static void main(String[] args) throws Exception
        {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
       // st.push(50);
        //st.push(60);
        Bottom_Insert(st, 8);
        System.out.println(st);
        st.display();


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
