import java.util.*;
public class vowelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1 = sc.nextLine();
        StringBuilder str=new StringBuilder();
        str.append(str1);
        //for(int i=0;i<str.length()-1;i++) => while using this, if vowels came near to each other, it got skipped because we are modifying a stringbuilder and while deleting it shifts indices which makes the second vowel to be skipped.
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                str.deleteCharAt(i);
            }
        }
        String result=str.toString();
        System.out.println("String without vowels : "+result);
        sc.close();
    }
}
