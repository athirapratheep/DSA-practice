package Practice_java;
import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        System.out.println("Enter the character value k:");

        
        int k = sc.nextInt();
        sc.close();
        boolean val=k_anagrams(str1, str2, k);
        System.out.println(val); 
        
    }
    public static boolean k_anagrams(String s1,String s2,int k)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        HashMap <Character,Integer> map1=new HashMap<>();
        HashMap <Character,Integer> map2=new HashMap<>();
        for(char ch:s1.toCharArray())
        {
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:s2.toCharArray())
        {
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int changes=0;
        for(char ch:map1.keySet())
        {
            int count1=map1.get(ch);
            int count2=map2.getOrDefault(ch, 0);
            if(count1>count2)
            {
                changes+=count1-count2;
            }
        }
        if(changes<k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
