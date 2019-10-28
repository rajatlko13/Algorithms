public class MergeSort  
{  
void merge(int a[], int beg, int mid, int end)  
{    
int l = mid - beg + 1;  
int r = end - mid;   
int LeftArray[] = new int [l];  
int RightArray[] = new int [r];  
for (int i=0; i<l; ++i)  
LeftArray[i] = a[beg + i];   
for (int j=0; j<r; ++j)  
RightArray[j] = a[mid + 1+ j];     
int i = 0, j = 0;  
int k = beg;  

while (i<l&&j<r)  
{  
if (LeftArray[i] <= RightArray[j])  
{  
a[k] = LeftArray[i];  
i++;  
}  
else  
{  
a[k] = RightArray[j];  
j++;  
}  
k++;  
}  

while (i<l)  
{  
a[k] = LeftArray[i];  
i++;  
k++;  
}  
  
while (j<r)  
{  
a[k] = RightArray[j];  
j++;  
k++;  
}  
}  
  
void sort(int a[], int beg, int end)  
{  
if (beg<end)  
{  
int mid = (beg+end)/2;  
sort(a, beg, mid);  
sort(a , mid+1, end);  
merge(a, beg, mid, end);  
}  
}  

public static void main(String args[])  
{  
int a[] = {28,12,55,33,65,878,2,34,54};  
MyMergeSort ob = new MyMergeSort();  
ob.sort(a, 0, arr.length-1);   
System.out.println("\nSorted array");  
for(int i=0; i<a.length;i++)  
{  
    System.out.println(a[i]+"");  
}  
}  
}  
