package Practice_java;
import java.util.ArrayList;
import java.util.Scanner;
public class posneg {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] res=new int[n];
        res=RearrangeBySign(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
    public static int[] RearrangeBySign(int[] arr,int n)
    {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int i=0,j=0,k=0;
        while(i<pos.size() && j<neg.size())
        {
            arr[k++]=pos.get(i++);
            arr[k++]=neg.get(j++);
        }
        while(i<pos.size())
        {
            arr[k++]=pos.get(i++);
        }
        while(j<neg.size())
        {
            arr[k++]=neg.get(j++);
        }
        return arr;
    }
}
