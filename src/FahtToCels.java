import java.util.*;
public class FahtToCels {

	public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int minFaht=sc.nextInt();
        int maxFaht=sc.nextInt();
        int steps=sc.nextInt();
        if(steps>0 && minFaht>=0 && minFaht<100 && maxFaht>minFaht && maxFaht<500)
        {
            System.out.println("reached in if");

            int convPoint=minFaht;

            while(convPoint<=maxFaht)
            {
                int celsValue=(5/9)*(convPoint-32);
                System.out.println(convPoint+"  "+celsValue);
                convPoint+=steps;
            }
        }
    }

}
