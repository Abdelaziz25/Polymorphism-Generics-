package com.company;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = { 47, 85, 62, 34, 7, 10, 92, 106, 2, 54 };
        Sort<Integer> algorithm = new Bubble<Integer>();
        algorithm.sort(intArr);
        System.out.println("Sorted array- " + java.util.Arrays.toString(intArr));
    }
}
