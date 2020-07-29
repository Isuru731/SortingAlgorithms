package com.iep_projects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] items =  new int[]{30,10,40,60,20,80,70,50};
        BubbleSort sorter = new BubbleSort();
        sorter.Sort(items);
        System.out.println(Arrays.toString(items));





    }
}
