package Practice_java;
import java.util.*;
public class plusOne {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits=new int[n];
        for(int i=0;i<n;i++)
        {
            digits[i]=sc.nextInt();
        }
        int[] res=plusOnefn(digits);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
    public static int[] plusOnefn(int[] digits) 
    {
        int number=0;
        for(int i:digits)
        {
            number=number*10+i;
        }
        number++;
        int length=(int) Math.log10(number)+1;
        int[] result=new int[length];
        for(int i=length-1;i>=0;i--)
        {
            result[i]=number%10;
            number/=10;
        }
        return result;
    }
}
