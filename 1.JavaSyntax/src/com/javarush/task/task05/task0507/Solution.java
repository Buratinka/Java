package com.javarush.task.task05.task0507;
import java.io.*;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int num=0,count=0,num2=0;
        double sum = 0;
        while(num>=0)
        {
            
     num = Integer.parseInt(reader.readLine());
     if(num==-1)break;
            // for(int i =0;i<1;++i)
            // {
                
            // }
            num2=num;
            sum = sum+num2;
            ++count;
            num=0;
            
            
        }
        
      
            sum=sum/count;
            System.out.print(sum);
     
   
    }
    }


