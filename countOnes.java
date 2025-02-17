package Practice_java;
import java.util.*;
public class countOnes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=oneNumber(arr,n);
        System.out.println("Number of one's are :"+ans);
        sc.close();
    }
    public static int oneNumber(int arr[],int n)
    {
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
