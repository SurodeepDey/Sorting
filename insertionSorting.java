package Miscellaneous;

import java.util.Arrays;

public class insertionSorting
{
    public static void main(String[] args)
    {
        int[] arr = {2,4,1,5,3};
        int n= arr.length;
        int[] res = insertionSorting(arr,n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] insertionSorting(int[] arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            int current = arr[i];
            int j= i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= current;
        }
        return arr;
    }
}
