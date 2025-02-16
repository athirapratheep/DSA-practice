package Practice_java;
import java.util.*;
public class unionArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1:");
        int n1=sc.nextInt();
        System.out.println("Enter the elements of array 1:");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array 2:");
        int n2=sc.nextInt();
        System.out.println("Enter the elements of array 2:");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int ans[] =new int[n1+n2];
        ans=unionfind(arr1,arr2,n1,n2);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
    public static int[] unionfind(int arr1[],int arr2[],int n1,int n2)
    {
        HashSet <Integer> union=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            union.add(arr1[i]);
        }
        for(int i=0;i<n2;i++)
        {
            union.add(arr2[i]);
        }
        int[] array=new int[union.size()];
        int i=0;
        for(int num:union)
        {
            array[i++]=num;
        }
        return array;
    }
}
