package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream console = System.out; // remember native value output stream

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); // create dynamic array

        PrintStream ps = new Wrapper (new PrintStream(outputStream)); // create decorator to class Print Stream

        System.setOut(ps); // set him like current



        testString.printSomething();

        System.setOut(console); // return native value



        System.out.println(outputStream);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }

    public static class Wrapper extends PrintStream
    {
        private static int count = 0;

        private PrintStream printStream;

        Wrapper (PrintStream printStream) {
            super(printStream);
            this.printStream = printStream;
        }

        public String reklam()
        {
            return "\nJavaRush - курсы Java онлайн";
        }

        @Override
        public void print(String s)
        {
            if (Wrapper.count == 1)
            {
                printStream.print(s+reklam());
                Wrapper.count = 0;
            }
            else
                {
                printStream.print(s);
                ++Wrapper.count;
            }
        }

        public Wrapper(OutputStream out) {
            super(out);
        }
    }


}
