package Array.Assignment3;
import java.util.*;

public class PairOfRoses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		if(t>=1 && t<=100) 
		{
			for (int i = 0; i < t; i++) 
			{
				int no_of_roses=sc.nextInt();
				if(no_of_roses>=0 && no_of_roses<=10000) 
				{
					int[] priceOfEachRoses=new int[no_of_roses];
					for (int j = 0; j < priceOfEachRoses.length; j++) 
					{
						priceOfEachRoses[j]=sc.nextInt();
						
					}
					
					int moneyAvailable=sc.nextInt();
					Arrays.sort(priceOfEachRoses);
					
					CanBuy(no_of_roses, priceOfEachRoses, moneyAvailable);
					
					
					
				}
				
			}
		}

	}
	
	public static void CanBuy(int nOR,int[] pOR,int ma)
	{

		int min_difference=Integer.MAX_VALUE;
		int ans=0;
		boolean canBuyFlag=false;


		for (int i = 0; i < pOR.length; i++)
		{
			for (int j = i+1; j < pOR.length; j++)
			{
				if(pOR[i]+pOR[j] == ma)
				{
					if(min_difference>(pOR[j]-pOR[i]))
					{
						min_difference=Math.min((pOR[j]-pOR[i]),min_difference);
						ans=pOR[i];
					}

					canBuyFlag=true;

				}

			}

		}
		if(canBuyFlag)
		{
			System.out.println("Deepak should buy roses whose prices are "+ans+" and "+(ma-ans));
		}

	}

}
