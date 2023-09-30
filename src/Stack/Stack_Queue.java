package Stack;

import Queue.Queue_Dynamic;

public class Stack_Queue
{
    private Queue_Dynamic q;

    Stack_Queue()
    {
        q = new Queue_Dynamic();
    }

    public boolean IsEmpty()
    {
        return q.isEmpty();
    }

    public int size()
    {
        return q.size();
    }

    public void push(int item) throws Exception {
         q.Enqueue(item);
    }



    public int pop()
    {
        return 1;
    }
    public int peek(int item) throws Exception {
        Queue_Dynamic hlp = new Queue_Dynamic();
        while (q.size() > 1)
        {
            hlp.Enqueue(q.Dequeue());
        }
        int rv = q.Dequeue();
        while (hlp.size() > 0)
        {
            q.Enqueue(hlp.Dequeue());
        }
        return rv;
    }
}
