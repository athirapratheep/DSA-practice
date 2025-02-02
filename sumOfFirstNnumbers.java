package Practice_java;
import java.util.Scanner;
public class sumOfFirstNnumbers {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int result=sumOfNumbers(n);
        System.out.println("sum till "+n+" is : "+result);
        sc.close();
    }
    public static int sumOfNumbers(int n)
    {
        int sum=0;
        if(n>0)
        {
            sum = n+sumOfNumbers(n-1);
        }
        return sum;
    }
}
