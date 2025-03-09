package Practice_java;
import java.util.*;
public class HCF {
    public static void main(String[] args) 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        while(b!=a)
        {
            if(b>a)
            {
                b=b-a;
            }
            else{
                a=a-b;
            }
        }
        System.out.println("The HCF of the two numbers is: "+b);
        sc.close();
    }
}
