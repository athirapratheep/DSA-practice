package Practice_java;

import java.util.ArrayList;
import java.util.Scanner;

public class sort012 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        sorting(arr);
        System.out.println("after sorting: ");
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
    public static void sorting(ArrayList<Integer> arr)
    {
        int cnt0=0,cnt1=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==0)
            {
                cnt0++;
            }
            else if(arr.get(i)==1)
            {
                cnt1++;
            }
            
        }
        for(int i=0;i<cnt0;i++)
        {
            arr.set(i,0);
        }
        for(int i=cnt0;i<cnt0+cnt1;i++)
        {
            arr.set(i,1);
        }
        for(int i=cnt0+cnt1;i<arr.size();i++)
        {
            arr.set(i,2);
        }
        
    }
}
