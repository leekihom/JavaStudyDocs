package com.example.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class IoApplication {

    public static void main(String[] args) throws IOException {
        /**
         * InputStream
         */
        File f = new File("D:\\IdeaWorkSpace\\JavaStudyDocs\\IO\\src\\main\\resources\\hello.txt");
       /*
        try {
            InputStream inputStream = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            String result = new String(bis.readAllBytes());
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

        /**
         * OutputStream
         */
        /*OutputStream outputStream = new FileOutputStream(f,true);
        byte[] array = "\r\nhello C#!".getBytes();
        outputStream.write(array);
        InputStream inputStream = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        String result = new String(bis.readAllBytes());
        System.out.println(result);
        outputStream.close();
        inputStream.close();*/

        /**
         * FileReader
         */

       /* FileReader fileReader = new FileReader("D:\\IdeaWorkSpace\\JavaStudyDocs\\IO\\src\\main\\resources\\hello.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int read = fileReader.read();
        while (read != -1){
            char ch = (char) read;
            System.out.print(ch);
            read = fileReader.read();
        }*/
        //System.out.println(bufferedReader.readLine());;

        /**
         * FileWriter
         */
        Writer writer = new FileWriter(f,true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("okok");
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
