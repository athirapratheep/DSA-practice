import java.util.Scanner;
public class ArrayRotation {
    public static void rotateArrayleft(int[] arr,int d)
    {
        int n=arr.length;
        for(int i=0;i<d;i++)
        {
            int first=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the time of rotation");
        int d=sc.nextInt();
        rotateArrayleft(arr,d);
        System.out.println("The result array");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
