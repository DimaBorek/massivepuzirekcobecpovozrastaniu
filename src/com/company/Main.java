package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.scene.chart.BubbleChart;
import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{6,4,5, 4, 3, 2, -9, 4};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[]arr){
    for (int i = arr.length-1;i>0;i--){
            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[j+1]){
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
}
