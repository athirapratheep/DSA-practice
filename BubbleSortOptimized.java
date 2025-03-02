import java.util.Scanner;
public class BubbleSort {
    p
            if(swapped==false)
            {
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int n=arr.length;
        System.out.println("enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr, n);
        System.out.println("sorted array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
