package Practice_java;
import java.util.*;
public class TwoSumagain {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        TwoSumVariants(arr,target);
        sc.close();
    }
    public static void TwoSumVariants(int[] arr,int target)
    {
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("YES");
                    System.out.println("["+arr[i]+" "+arr[j]+"]");
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("NO");
            System.out.println("[-1,-1]");
        }
    }
}
