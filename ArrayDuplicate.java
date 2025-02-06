import java.util.*;
public class ArrayDuplicate{
    static List<Integer> findDuplicates(Integer[] arr)
    {
        Map<Integer,Integer> hmap=new HashMap<>();
        List<Integer> duplicates=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {jhg
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hmap.entrySet())
        {
            if(entry.getValue() > 1)
            {
                duplicates.add(entry.getKey());
            }
        }
        System.out.println("Count of duplicates respectively:"+ hmap);
        if (duplicates.isEmpty()) {
            duplicates.add(-1);
        }
        return duplicates;
    }       
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        List<Integer> result=findDuplicates(arr);
        System.out.println("The duplicates are:");
        for(int i:result)
        {
            System.out.println(i+" ");
        }
        sc.close();
    }
}
