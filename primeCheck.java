package Practice_java;
import java.util.Scanner;
public class primeCheck {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int isprime=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                isprime=1;
                break;
            }
        }
        if(isprime==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else
        {
            System.out.println(n+" is a prime number.");
        }
        sc.close();
    }    
}
