package com.learning.basic;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _01_Problem {
    // print the given list in reverse order


    public static void main(String[] args) {
        List<Integer> list = List.of(12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 20, 12);

        System.out.println("size of list : " + list.size());
        for (int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + ", ");
        }
    }
}
