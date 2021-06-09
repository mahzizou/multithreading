package com.afaqy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RunnableDemo implements Runnable {

    private String filePath;
    public RunnableDemo(String filePath){
        this.filePath = filePath;
    }

    @Override
    public void run() {

        try{
            File file = new File(filePath);
//            FileReader reader = new FileReader();
            FileReader fileReader = new FileReader(file);
            int ch = fileReader.read();
            System.out.println("\nfile length\t" + file.length() + "\n");
            System.out.println("\nch\t" + ch + "\n");
            while (ch != -1){
                System.out.println((char)ch);
                ch = fileReader.read();
                if(file.length() > 5000){
                    Thread.currentThread().setPriority(1);
                }
            }
            fileReader.close();
            if (ch == -1){
                System.err.println(" File " + Thread.currentThread().getName() + " Finish");
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
