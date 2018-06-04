package com.javarush.task.task21.task2106;

import java.util.Date;

/* 
Ошибка в equals/hashCode
*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Solution)) return true;

        Solution solution1 = (Solution) o;


        if (Double.compare(solution1.aDouble, aDouble) != 0) return false;
        if (anInt != solution1.anInt) return false;
        if (date != null ? !date.equals(solution1.date) : solution1.date != null) return false;
        if (solution != null ? !solution.equals(solution1.solution) : solution1.solution != null) return false;
        if (string != null ? !string.equals(solution1.string) : solution1.string != null) return false;

        return true;

    }

    @Override
    public int hashCode() {

        int num = 31;
        int result = 1;




        result = num * result + (String.valueOf(anInt) == null ? 0 : String.valueOf(anInt).hashCode());
        result = num * result + (string == null ? 0 : string.hashCode());
        result = num * result + (String.valueOf(aDouble) == null ? 0 : String.valueOf(aDouble).hashCode());
        result = num * result + (date == null ? 0 : date.hashCode());
        result = num * result + (solution == null ? 0 : solution.hashCode());

        return result;
    }

    public static void main(String[] args) {

    }
}
