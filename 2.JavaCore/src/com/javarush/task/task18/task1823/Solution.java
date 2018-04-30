package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s ="";
        while(!((s=reader.readLine()).equals("exit")))
        {
           ReadThread nt = new ReadThread(s);
           nt.start();
        }

    }

    public static class ReadThread extends Thread  {

        private String fileName;
        private byte findByte;


        public ReadThread(String fileName) {

        this.fileName = fileName;


        }

        @Override
        public void run() {



                HashMap<Byte, Integer> frequencyMap = new HashMap<Byte, Integer>();
            try {
                FileInputStream f = new FileInputStream(this.fileName);

                while (f.available() > 0) {
                    byte[] buf = new byte[f.available()];
                    f.read(buf);

                    for(byte b : buf){

                        if (frequencyMap.containsKey(b))
                            frequencyMap.put(b, frequencyMap.get(b) + 1);
                        else
                            frequencyMap.put(b, 1);
                    }
                }
                f.close();
            }catch (IOException e){
                e.getMessage();}

                int max = 0;

            for(Map.Entry<Byte,Integer> map : frequencyMap.entrySet() )
            {
                if(map.getValue()>max)
                {
                    this.findByte = map.getKey();
                    max=map.getValue();}
            }

            synchronized (resultMap)
            {
                resultMap.put(this.fileName, (int) this.findByte);
            }

        }

        // implement file reading here - реализуйте чтение из файла тут
    }
}
