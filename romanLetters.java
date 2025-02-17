package Practice_java;
import java.util.*;
public class romanLetters {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        String s=sc.nextLine();
        int n=romanToInt(s);
        System.out.println("The integer value of the roman number is: "+n);
        sc.close();
    }
    public static int romanToInt(String s)
    {
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int s1=value(s.charAt(i));
            if(i+1<s.length())
            {
                int s2=value(s.charAt(i+1));
                if(s1>s2)
                {
                    res+=s1;
                }
                else{
                    res+=(s2-s1);
                    i++;
                }
            }
            else
            {
                res+=s1;
            }
        }
        return res;
    }
    static int value(char ch)
    {
        if(ch=='I')
            return 1;
        if(ch=='V')
            return 5;
        if(ch=='X')
            return 10;
        if(ch=='L')
            return 50;
        if(ch=='C')
            return 100;
        if(ch=='D')
            return 500;
        if(ch=='M')
            return 1000;
        return -1;
    }
}
