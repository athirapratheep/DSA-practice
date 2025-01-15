import java.util.Scanner;
public class SelectionSort {
    public static void sorting(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sorting(arr);
        System.out.println("Sorted array:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
