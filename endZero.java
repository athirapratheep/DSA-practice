package Practice_java;
import java.util.*;
public class endZero {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        
            arr[i]=sc.nextInt();
        }
        int[] ans=moveZero(size,arr);
        for(int i=0;i<size;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
    public static int[] moveZero(int size,int[] arr)
    {
        int j=-1;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)return arr;
        for(int i=j+1;i<size;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
}
