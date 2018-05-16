package com.javarush.task.task19.task1916;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader file1 = new BufferedReader(new FileReader(fileName.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(fileName.readLine()));




        LineItem lineitem;
        String file1Read;
        String file2Read;

        while(file1.ready() && file2.ready())
        {
            file1Read = file1.readLine();
            file2Read = file2.readLine();


                if(file1Read.equals(file2Read))
                {
                    lineitem = new LineItem(Type.SAME," " + file1Read);

                    lines.add(lineitem);

                }
                else if(file1Read.equals("") && !file2Read.equals(""))
                {
                    lineitem = new LineItem(Type.ADDED," " + file2Read);

                    lines.add(lineitem);
                }else if(!file1Read.equals("") && file2Read.equals(""))
                {
                    lineitem = new LineItem(Type.REMOVED," " + file1Read);
                    lines.add(lineitem);
                }


        }

        fileName.close();
        file1.close();
        file2.close();


        for(LineItem line : lines)
        {
            System.out.println(line.type + " " + line.line);
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
///home/oleg/newfile.txt
///home/oleg/newfile2.txt