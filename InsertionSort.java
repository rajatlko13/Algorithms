public class InsertionSort
{  
    public static void insertionSort(int a[]) 
    {  
        int n = a.length;  
        for (int j = 1; j < n; j++)
        {  
            int key = a[j];  
            int i = j-1;  
            while ( (i > -1) && ( a[i] > key ) )
            {  
                a[i+1] = a[i];  
                i--;  
            }  
            a[i+1] = key;  
        }  
    }  
       
    public static void main(String a[])
    {    
        int[] a = {28,12,55,33,65,878,2,34,54};    
        System.out.println("Before Insertion Sort");    
        for(int i:a)
        {    
            System.out.print(i+" ");    
        }    
        System.out.println();                
        insertionSort(a);            
        System.out.println("After Insertion Sort");    
        for(int i:a)
        {    
            System.out.print(i+" ");    
        }    
    }    
}   
