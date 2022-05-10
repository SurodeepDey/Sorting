package com.company.InterviewGround;

import java.util.HashMap;

public class NonRepeatingelement
{
    public static void main(String[] args)
    {
        int[] arr ={1,2,3,1,4,2,4,5,6,7};
        int n= arr.length;
        System.out.println(noRepeat(arr,n));
    }
    public static int noRepeat(int[] arr,int n)
    {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])==1)
                return arr[i];
        }
        return -1;

    }

}
