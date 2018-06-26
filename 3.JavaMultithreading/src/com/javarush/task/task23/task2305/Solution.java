package com.javarush.task.task23.task2305;

import java.util.ArrayList;
import java.util.List;

/*
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {

        Solution[] list = new Solution[2];

        Solution s1 = new Solution();
        Solution s2 = new Solution();

        s1.innerClasses[0] = s1.new InnerClass();
        s1.innerClasses[1] = s1.new InnerClass();
        s2.innerClasses[0] = s2.new InnerClass();
        s2.innerClasses[1] = s2.new InnerClass();

        list[0] = s1;
        list[1] = s2;

        return list;
    }

    public static void main(String[] args) {

    }
}
