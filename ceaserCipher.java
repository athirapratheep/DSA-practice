package Practice_java;
import java.util.*;
public class ceaserCipher {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be encrypted:");
        String text=sc.nextLine();
        System.out.println("Enter the shift value:");
        int shift=sc.nextInt();
        String s1=encrypt(text,shift);
        System.out.println("Encrypted string is:"+s1);
        sc.close();
    }
    public static String encrypt(String text,int shift)
    {
        StringBuilder result=new StringBuilder();
        for(char ch:text.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                char base=Character.isUpperCase(ch)? 'A':'a';
                result.append((char)((ch-base+shift)%26+base));
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}
