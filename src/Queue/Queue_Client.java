package Queue;

public class Queue_Client
{
    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);

        System.out.println("after add");
        q.display();
        System.out.println("after remove");
        q.Dequeue();
        q.display();

        System.out.println("adding ...");
        q.Enqueue(60);
        q.display();




    }
}
