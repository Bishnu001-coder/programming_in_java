package _7_Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void insort(int[]a){
        for(int i=1;i<a.length;i++){
            int j=i-1;
            int key=a[i];
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        }


    public static void main(String[] args) {
        int[] a={9,1,5,2};
        insort(a);
        System.out.print(Arrays.toString(a));
    }
}
