package Stack;

public class Stack
{
    private int[] arr;
    private int idx=-1;
    public Stack()
    {
        arr=new int[5];
    }

    public Stack(int n)
    {
        arr=new int[n];
    }

    public boolean isEmpty()
    {
        return idx == -1;
    }

    public boolean isFull()
    {
        return idx == arr.length-1;
    }

    public void push(int item) throws Exception {
        if(isFull())
        {
            throw new Exception("The Stack is full");
        }
        idx++;
        arr[idx] = item;
    }


    public int size()
    {
        return idx + 1;
    }

    public int pop() throws Exception {
        if(isEmpty())
        {
            throw new Exception("The Stack is Empty");
        }
        int remEl=arr[idx];;
        idx--;
        return remEl;

    }

    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("The Stack is Empty");
        }
        return arr[idx];
    }

    public void display()
    {
        System.out.print("[");
        for (int i=0;i<=idx;i++)
        {
            if(i != idx){
            System.out.print(arr[i]+", ");
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }

}
