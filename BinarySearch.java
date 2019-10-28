class BinarySearch
{  
 public static void binarySearch(int a[], int first, int last, int key)
 {  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( a[mid] < key )
      {  
        first = mid + 1;     
      }
      else if ( a[mid] == key )
      {  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }
      else
      {  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last )
   {  
      System.out.println("Element is not found!");  
   }  
 }  
 
 public static void main(String args[])
 {  
        int a[] = {28,12,55,33,65,878,2,34,54};  
        int key = 34;  
        int last=a.length-1;  
        binarySearch(a,0,last,key);     
 }  
}  
