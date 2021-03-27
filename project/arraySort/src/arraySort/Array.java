package arraySort;
import java.util.Arrays;
import java.util.Collections;  
public class Array{  
public static  int removeDuplicateElements(Integer[] arr, int n){  
       
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
      public static void main (String[] args) {  
        Integer arr[] = {2,5,4,1,2,1,6};//unsorted array  
        
        Arrays.sort(arr, Collections.reverseOrder());
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements 
       
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  