import java.util.*;
public class KadanesAlgorithm {
    public static void maxSubarraySum(int[] arr)
    {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        int temp=0,start=0,end=0;
        List <Integer> result= new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(sum+arr[i]>arr[i])
            {
                sum=sum+arr[i];
            }
            else{
                sum=arr[i];
                temp=i;
            }
            if(sum>maxi)
            {
                maxi=sum;
                start=temp;
                end=i;
            }
        }
        for(int i=start;i<=end;i++)
        {
            result.add(arr[i]);
        }
        System.out.println("\nThe maximum sum subarray is: ");
        for(int ele:result)
        {
            System.out.print(ele+" ");
        }
        System.out.println("\nThe maximum subarray sum is: "+maxi);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        maxSubarraySum(arr);
        sc.close();
    }
}

//sample i/o
// Enter the size of the array: 
// 7
// Enter the elements of the array: 
// 2
// 3
// -8
// 7
// -1
// 2
// 3

// The maximum sum subarray is: 
// 7 -1 2 3 
// The maximum subarray sum is: 11
