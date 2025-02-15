package Practice_java;
import java.util.*;
public class linearSearch {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int val=keyfinder(arr, size, k);
        System.out.println(val);
        sc.close();
    }
    public static int keyfinder(int[] arr,int size,int k)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==k)
            {
                System.out.println("found");
            }
        }
        return k;
    }
}
