package com.company;

public class Main2 {
    public static void main(String[] args) {
        String[] strArr = { "Gamma", "Beta", "Delta", "Alpha", "Theta" };;
        Sort<String> algorithm = new Bubble<String>();
        algorithm.sort(strArr);
        System.out.println("Sorted array- " + java.util.Arrays.toString(strArr));
    } }
