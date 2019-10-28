public class SelectionSort
{  
    public static void selectionSort(int[] a)
    {  
        for (int i = 0; i < a.length - 1; i++)  
        {  
            int min = i;  
            for (int j = i + 1; j < a.length; j++)
            {  
                if (a[j] < arr[min])
                {  
                    index = j; 
                }  
            }  
            int temp = a[min];   
            a[min] = a[i];  
            a[i] = temp;  
        }  
    }  
       
    public static void main(String a[])
    {  
        int[] a = {28,12,55,33,65,878,2,34,54};  
        System.out.println("Before Selection Sort");  
        for(int i:a)
        {  
            System.out.print(i+" ");  
        }  
        System.out.println();  
        selectionSort(a);        
        System.out.println("After Selection Sort");  
        for(int i:a)
        {  
            System.out.print(i+" ");  
        }  
    }  
}  
