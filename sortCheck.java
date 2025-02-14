package Practice_java;
import java.util.*;
public class sortCheck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean tick=true;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                tick=false;
                break;
            }
            
        }
        if(tick)
        {
            System.out.println("Sorted");
        }
        else
        {
            System.out.println("Not Sorted");
        }
        sc.close();
    }
}
