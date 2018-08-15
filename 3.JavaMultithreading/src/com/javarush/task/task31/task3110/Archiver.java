package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver
{
    public static void main(String[] args) throws Exception {
        String str;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ZipFileManager zipFileManager = null;

        System.out.println("Write full path to archive : ");

        if((str = reader.readLine()) != null)
        {
            zipFileManager = new ZipFileManager(Paths.get(str));
        }

        System.out.println("Write full path to file : ");

        if((str = reader.readLine()) != null)
        {
            zipFileManager.createZip(Paths.get(str));
        }


    }
}
