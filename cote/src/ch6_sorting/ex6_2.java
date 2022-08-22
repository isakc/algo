package ch6_sorting;

import java.util.*;

public class ex6_2 {

    public static void main(String[] args) {

        int[] arr = {3, 5};

        // ½º¿ÍÇÁ(Swap)
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(arr[0] + " " + arr[1]);
    }

}