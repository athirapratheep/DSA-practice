package Practice_java;
import java.util.*;
public class missingNumber {
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
        int ans=number(arr,n);
        System.out.println("Missing number is :"+ans);
        sc.close();
    }
    public static int number(int arr[],int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]==i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                return i;
            }
        }
        return -1;
    }
}
