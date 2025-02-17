package Practice_java;
import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextLine();
        }
        String ans=longprefix(arr);
        System.out.println("longest prefix: "+ans);
        sc.close();
    }
    public static String longprefix(String[] arr)
    {
        if(arr.length==0)
        {
            return "";
        }
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[arr.length-1];
        int minlength=Math.min(first.length(),last.length());
        int i=0;
        while(i<minlength&&(first.charAt(i)==last.charAt(i)))
        {
            i++;
        }
        return first.substring(0, i);
    }
}
