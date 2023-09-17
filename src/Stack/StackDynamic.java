package Stack;

public class StackDynamic extends Stack
{
    @Override
    public void push(int item) throws Exception {
        if(isFull())
        {
            int[] a = new int[2*arr.length];
            for (int i = 0; i < arr.length; i++) {
                a[i] = arr[i];
            }
            arr=a;

        }
        super.push(item);


    }

    public static void main(String[] args) throws Exception {
        StackDynamic ds = new StackDynamic();
        ds.push(1);
        ds.push(5);
        ds.push(7);
        ds.push(11);
        ds.push(12);
        ds.push(13);
        ds.push(15);

        ds.display();

    }
}
