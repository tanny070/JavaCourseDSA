package Queue;

public class Queue_Dynamic extends Queue
{
    @Override
    public void Enqueue(int item) throws Exception {
        if(isFull())
        {
            int []a = new int[2 * arr.length];
            for (int i = 0; i < size; i++)
            {
                int idx = (front + i) % arr.length;
                a[i] = arr[idx];
            }
            front = 0;
            arr = a;

        }
        super.Enqueue(item);
    }

    public static void main(String[] args) throws Exception {
        Queue_Dynamic dq = new Queue_Dynamic();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Enqueue(50);
        dq.Enqueue(60);
        dq.Enqueue(70);

        dq.display();

    }

}
