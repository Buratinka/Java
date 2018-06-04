package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object obj)
    {
        if(obj == this)
        {
            return true;
        }
        if(obj.getClass() != this.getClass())
        {
            return false;
        }
        if(!(obj instanceof Solution))
        {
            return false;
        }

        Solution solution = (Solution) obj;

        return first == solution.first && last == solution.last;
    }

    public int hashCode()
    {
        final int num = 31;
        int result = 1;

        result = num * result + (first == null ? 0 : first.hashCode());
        result = num * result + (last == null ? 0 : first.hashCode());

        return result;
    }

    public static void main(String[] args)
    {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
