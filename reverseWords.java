package Practice_java;
import java.util.*;
public class reverseWords {
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        sc.close();
        reverseWords(s);
    }
    public static void reverseWords(String s)
    {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]+" ");
        }
        System.out.println(sb);
    }
}
