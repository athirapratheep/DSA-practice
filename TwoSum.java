package Practice_java;
import java.util.*;
public class TwoSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] ans=targetcheck(nums,target);
        System.out.print("[ ");
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(+ans[i]+" ");
        }
        System.out.print("]");
        sc.close();
    }
    public static int[] targetcheck(int[] nums,int target)
    {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.
