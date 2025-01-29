import java.util.*;
public class compressedString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String s=sc.nextLine();
        String compress=compressString(s);
        System.out.println(compress);
        sc.close();
    }
    public static String compressString(String s)
    {
        Map<Character,Integer> freqmap=new HashMap<>();
        for(int i=0;i<s.length();i+=2)
        {
            char ch=s.charAt(i);
            int count=Character.getNumericValue(s.charAt(i+1));
            freqmap.put(ch,freqmap.getOrDefault(ch, 0)+count);
        }
        List<Character> sortedKeys=new ArrayList<>(freqmap.keySet());
        Collections.sort(sortedKeys);
        StringBuilder result=new StringBuilder();
        for(char ch:sortedKeys)
        {
            result.append(ch).append(freqmap.get(ch));
        }
        return result.toString();
    }
}
