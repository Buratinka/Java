
package com.javarush.task.task19.task1916;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));



        FileReader file1 = new FileReader(fileName.readLine());
        FileReader file2 = new FileReader(fileName.readLine());

        BufferedReader fileReader1 = new BufferedReader(file1);
        BufferedReader fileReader2 = new BufferedReader(file2);

        LinkedList<String> original = new LinkedList();
        LinkedList<String> edited = new LinkedList();



        String nameLine1 = null;
        String nameLine2 = null;

        while(fileReader1.ready())
        {
            nameLine1 = fileReader1.readLine();
            original.add(nameLine1);
        }


        while(fileReader2.ready())
        {

            nameLine2 = fileReader2.readLine();
            edited.add(nameLine2);

        }



        for(int i =0;i<original.size();++i)
        {
            if(original.get(i).equals(edited.get(i)))
            {
                lines.add(new LineItem(Type.SAME,original.get(i)));
                edited.set(i,null);
            }
            else
                if (!original.get(i).equals(edited.get(i)) && original.get(i).equals(edited.get(i + 1)))
                {
                lines.add(new LineItem(Type.ADDED, edited.get(i)));
                edited.remove(i);
            }
            else if (!original.get(i).equals(edited.get(i)) && !original.get(i).equals(edited.get(i + 1)))
            {
                lines.add(new LineItem(Type.REMOVED, original.get(i)));
                edited.add(0 , null);
            }

        }

for(String s : original)
{
    System.out.print(s + "  ");
}

for(String s : edited)
{
    System.out.print(s + "    ");
}


for(LineItem li : lines)
{
    System.out.println(li.type + " " + li.line);
}



    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }

}
