public class BubbleSort
{  
    static void bubbleSort(int[] a)
    {  
        int n = a.length;  
        int temp;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(a[j-1] > a[j])
                          {   
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args)
    {  
                int a[] ={28,12,55,33,65,878,2,34,54};                
                System.out.println("Before Bubble Sort");  
                for(int i=0; i < a.length; i++)
                {  
                        System.out.print(a[i] + " ");  
                }  
                System.out.println();                   
                bubbleSort(a);                 
                System.out.println("After Bubble Sort");  
                for(int i=0; i < a.length; i++)
                {  
                        System.out.print(a[i] + " ");  
                }  
   
        }  
}  
