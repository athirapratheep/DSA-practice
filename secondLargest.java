package Practice_java;
import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=arr[arr.length-1])
            {
                System.out.println("second largest:" +arr[i]);
                break;
            }
        }
        sc.close();
    }
}
