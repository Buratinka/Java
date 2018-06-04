package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;

        try
        {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;

        }



        protected User clone() throws CloneNotSupportedException
        {
            return new User(this.age,this.name);
        }

        @Override
        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            if(obj == null)
            {
                return false;
            }
            if(!(obj instanceof User))
            {
                return false;
            }

            User user = (User)obj;

            return  age == user.age && name == user.name;

        }

        @Override
        public int hashCode()
        {
            int num = 31;
            int result = 1;
            result = num * result + (String.valueOf(age) == null ? 0 : String.valueOf(age).hashCode());
            result = num * result + (name == null ? 0 : name.hashCode());
            return result;
        }

    }

    protected Solution clone() throws CloneNotSupportedException
    {
        Solution solution = new Solution();
        for(Map.Entry<String,User> map : this.users.entrySet())
        {
            User user = map.getValue().clone();
            solution.users.put(map.getKey(), user);
        }
        return solution;
    }

}
