package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.scene.chart.BubbleChart;
import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 7, 9, 4};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[]arr){
    for (int i = arr.length-1;i>0;i--){
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }
            System.out.println();
            System.out.println("sorted array: "+ Arrays.toString(arr));

        }
    }
    private static int getMaxFromArray(int[] array){
        int indexOfMax = 0;
        int array1[] = new int[]{4,9,3,5};
        for (int i = 1; i < array1.length ; i++) {
            if (array[i]>array[indexOfMax]){
                indexOfMax = i;
            }

        }
        return array[indexOfMax];

    }


}
