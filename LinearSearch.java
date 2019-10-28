public class LinearSearch
{    
public static int linearSearch(int[] a, int key)
{    
        for(int i=0;i<arr.length;i++)
        {    
            if(arr[i] == key)
            {    
                return i;    
            }    
        }    
        return -1;    
}   

public static void main(String a[])
{    
    int[] a1= {28,12,55,33,65,878,2,34,54};    
    int key = 34;    
    System.out.println(key+" is found at index: "+linearSearch(a1, key));    
}    
}    
