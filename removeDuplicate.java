import java.util.*;
public class removeDuplicate {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        removeDuplicateset(arr);
    }
    public static void removeDuplicateset(int arr[])
    {
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
