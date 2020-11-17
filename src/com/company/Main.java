package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr={3,8,-10,23,19,-4,-14,27};
        Arrays.sort(arr);
        //List<ArrayList<Integer>> r = new ArrayList<ArrayList<Integer>>();
        List<List<Integer>> r = new ArrayList<>();

        int min=arr[1]-arr[0];
        if (arr.length == 2) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(arr[0]);
            al.add(arr[1]);
            r.add(al);
        } else {
           for (int i = 1; i < arr.length-1; i++) {
               if (min > arr[i + 1] - arr[i]) {
                   min = arr[i + 1] - arr[i];
               }
            }

            for (int i = 0; i <arr.length-1 ; i++) {
                if (min == arr[i + 1] - arr[i]) {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[i + 1]);
                    r.add(al);
                }
            }
        }

        for (List al: r) {
            System.out.println(al);
        }
    }
}
