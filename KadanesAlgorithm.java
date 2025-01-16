import java.util.Arrays;
import java.util.Scanner;
public class KadanesAlgorithm {
    public static int maxSubarraySum(int[] arr)
    {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=Math.max(sum+arr[i],arr[i]);
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ")
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ")
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
}
