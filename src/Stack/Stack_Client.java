package Stack;

public class Stack_Client
{
    public static void main(String[] args) throws Exception {
        Stack<Number> st=new Stack<Number>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
        System.out.println();
        System.out.println("Is Stack Empty: "+st.isEmpty());
        System.out.println("Is Stack Full: "+st.isFull());

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());

        st.display();

        st.push(60);
        st.push(70);

    }
}
