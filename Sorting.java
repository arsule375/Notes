
import java.io.*;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int arr[ ] =  { 8, 6, 9, 3 ,4, 5 };

                // //  // selection sort
       // selectionSort(arr);

        System.out.println("");
        // //  // insertion sort
        String stringArr2 = Arrays.toString(insertionSort(arr));
        System.out.println(stringArr2);


        System.out.print(bianarySerch(insertionSort(arr), 4));

        System.out.println("");



    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int j  = i;
            while (j > 0 && (arr[j -1] > arr[j])){
                int tem = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tem;
                j--;
            }

            String array2 = Arrays.toString(arr);
            System.out.println("Phase" + (i) + ":" +  array2);

        }


        return arr;
    }

    private static void selectionSort(int[] arr) {
        for(int j = 0; j < arr.length; j++ ){
            int min = j;
            for (int i = j + 1; i < arr.length; i++){
                if (arr[i] < arr[min]){
                    min = i;
                }
            }
            if (min != j){
                int temp = arr[j];
                arr[j] = arr[min];
                arr[min] = temp;
            }
            String array1 = Arrays.toString(arr);
            System.out.println("Phase" + (j + 1) + ":" +  array1);
        }

        for (int m = 0; m < arr.length; m++){
            System.out.print(arr[m] + " ");
        }
    }

    private static int  bianarySerch(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right ){
            int mid = (left + right)/2;
            if (arr[mid] == num){
                return mid;
            }else if (num < arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }
}


