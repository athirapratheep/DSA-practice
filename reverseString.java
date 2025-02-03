package Practice_java;
import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String rev=reverse(str);
        System.out.println("Reversed string is: "+rev);
        sc.close();

    }
    public static String reverse(String str)
    {
        if(str.isEmpty())
        {
            return str;
        }
        else{
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
}
