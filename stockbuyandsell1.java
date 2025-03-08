package Practice_java;
import java.util.*;
public class stockbuyandsell1 {    
       public static void main(String[] args)
       {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int prices[]=new int[n];
            for(int i=0;i<n;i++)
            {
                prices[i]=sc.nextInt();
            }
            int ans=stocke(prices);
            System.out.println(ans);
            sc.close();
       } 
        public static int stocke(int[] prices)
       {
            int maxpro=0;
            for(int i=0;i<prices.length;i++)
            {
                for(int j=i+1;j<prices.length;j++)
                {
                    if(prices[j]>prices[i])
                    {
                        maxpro=Math.max(prices[j]-prices[i],maxpro);
                    }
                }
            }
            return maxpro;
       }
}
