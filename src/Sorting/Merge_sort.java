package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_sort {
    public static void merge(int[]a,int[]b,int[]c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
    }
    public static void Sort(int[]a){
        if(a.length<=1) return;
        int []left=new int[a.length/2];
        int []right=new int[a.length-left.length];
        for(int i=0;i<left.length;i++){
            left[i]=a[i];
        }
        for(int j=0;j<right.length;j++){
            right[j]=a[j+left.length];
        }
        Sort(left);
        Sort(right);
        merge(left,right,a);
    }
    public static void main(String[] args) {
        int[] arr={9,7,5,4};
       Sort(arr);
    System.out.print(Arrays.toString(arr));
    }
}
