package com.afaqy;

public class Main {

    public static void main(String[] args) {

        RunnableDemo runnableDemo1 = new RunnableDemo("/home/afq-eg-lptp-122/Downloads/sample1.txt");
        RunnableDemo runnableDemo2 = new RunnableDemo("/home/afq-eg-lptp-122/Downloads/sample2.txt");
        RunnableDemo runnableDemo3 = new RunnableDemo("/home/afq-eg-lptp-122/Downloads/sample3.txt");
        RunnableDemo runnableDemo4 = new RunnableDemo("/home/afq-eg-lptp-122/Downloads/sample4.txt");


        Thread t1 = new Thread(runnableDemo1, "Sample1");
        Thread t2 = new Thread(runnableDemo2, "Sample2");
        Thread t3 = new Thread(runnableDemo3, "Sample3");
        Thread t4 = new Thread(runnableDemo4, "Sample4");

//        t1.setPriority(5);
//        t2.setPriority(5);
//        t3.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
