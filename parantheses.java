package Practice_java;
import java.util.*;
public class parantheses {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean value= bracketcheck(s);
        System.out.println(value);
        sc.close();
    }
    public static boolean bracketcheck(String s)
    {
        char[] brackets=s.toCharArray();
        boolean changed;
        do{
        changed=false;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<brackets.length;i++)
        {
            if(i<(brackets.length-1) &&((brackets[i]=='(' && brackets[i+1]==')')||(brackets[i]=='{' && brackets[i+1]=='}')||(brackets[i]=='[' && brackets[i+1]==']')))
            {
                i++;
                changed=true;
            }
            else
            sb.append(brackets[i]);
        }
        brackets=sb.toString().toCharArray();
        }while(changed);
        return brackets.length==0;
            
    }
}

