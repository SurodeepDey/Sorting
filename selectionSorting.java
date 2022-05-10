package com.company.InterviewGround;

import java.util.Arrays;

public class selectionSorting
{
    public static void main(String[] args)
    {
        int[] arr ={1,2,3,5,4};
        int n = arr.length;
        int[] res = selectionSort(arr,n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] selectionSort(int[] arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int small =i;
           // boolean flag =false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[small]>arr[j])
                {
                    small =j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i]= temp;
           // flag = true;
        }
        //if(flag == false
       return arr;
    }
}
