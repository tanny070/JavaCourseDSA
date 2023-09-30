package Queue;

public class Queue
{
    protected int[] arr;
    protected int front=0;
    protected int size=0;

    public Queue() {
        arr=new int[5];
    }
    public Queue(int n) {
        arr=new int[n];
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == arr.length;
    }

    public void Enqueue(int item) throws Exception {
        if(isFull())
        {
            throw new Exception("The queue is full");
        }
        int idx = (front + size) % arr.length;
        arr[idx] = item;
        size++;
    }

    public int Dequeue() throws Exception {
        if(isEmpty())
        {
            throw new Exception("The queue is Empty");
        }
        int rv=arr[front];
        front=(front+1) % arr.length;
        size--;
        return rv;
    }

    public int getFront() throws Exception {
        if(isEmpty())
        {
            throw new Exception("The queue is Empty");
        }
        int rv=arr[front];
        return rv;
    }

    public int size()
    {
        return this.size;
    }

    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }



}
