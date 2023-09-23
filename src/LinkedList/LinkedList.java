package LinkedList;

public class LinkedList
{
    public class Node
    {
        int data;
        Node next; // address
    }

    private Node head;
    private Node tail;
    private int size;

    public void Addfirst(int item)
    {
        Node nn = new Node();
        nn.data = item;

        if(size == 0)
        {
            head = nn;
            tail = nn;
            size++;

        }
        else
        {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void Addlast(int item)
    {
        if(size == 0)
        {
            Addfirst(item);
        }
        else
        {
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    // O(N)
    public void Add_at_index(int k,int item) throws Exception {
        if(k == 0)
        {
            Addfirst(item);
        }
        else if (k == size)
        {
            Addlast(item);

        }
        else
        {
            // getiing k-1th node
            Node nn = new Node();
            nn.data = item;
            Node k_1th = getNode(k-1);
            nn.next = k_1th;
            k_1th.next = nn;
            size++;

        }

    }

    public int getFirst()
    {
        return head.data;
    }

    public int getLast()
    {
        return tail.data;
    }

    public int get_at_index(int idx) throws Exception {
        return getNode(idx).data;
    }


    // O(N)
    public int removeFirst()
    {
        Node temp = head;
        if(size == 1)
        {
            tail = null;
            head = null;
            size--;
        }
        else
        {
            head = head.next;
            size--;
            temp.next = null;
        }

        return temp.data;
    }

    public int removeLast() throws Exception {
        if(size == 1)
        {
            return removeFirst();
        }

        else
        {
            Node nn = getNode(size-2);
            int rv = tail.data;
            nn.next = null;
            tail = nn;
            size--;
            return rv;
        }

    }

    public int remove_at_index(int k) throws Exception {
        if(k == size-1)
        {
            return removeLast();
        }
        else if (k == 0)
        {
            return removeFirst();
        }
        else
        {
            Node k_1th = getNode(k-1);
            Node kth = k_1th.next;
            k_1th.next = kth.next;
            kth.next = null;
            size--;
            return kth.data;
        }
    }

    private Node getNode(int k) throws Exception {
        if(k<0 || k>=size)
        {
            throw new Exception("not in range");
        }

        Node temp = head;
        for (int i = 0; i < k; i++)
        {
            temp = temp.next;
        }
        return temp;
    }


    public void Display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(".");
    }


}
