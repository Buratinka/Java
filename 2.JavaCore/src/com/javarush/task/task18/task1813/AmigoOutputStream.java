package com.javarush.task.task18.task1813;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream fs;

    public AmigoOutputStream(FileOutputStream fs) throws FileNotFoundException {
        super(String.valueOf(fs));
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void flush() throws IOException {
        fs.flush();
    }

    @Override
    public void write(int b) throws IOException {
        fs.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fs.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fs.write(b, off, len);
    }


    public void close() throws IOException {
        flush();
        String s ="JavaRush © All rights reserved.";
        fs.write(s.getBytes());
        fs.close();



    }

}

