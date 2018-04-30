package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements  ATableInterface{
ATableInterface ata;

public TableInterfaceWrapper(ATableInterface arta)
{
    this.ata =arta;
}

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
        this.ata.setModel(rows);


        }

        @Override
        public String getHeaderText() {
            return this.ata.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
        this.ata.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}