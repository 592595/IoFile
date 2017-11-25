package com.pp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class WriteFileExample {
    public static void main(String[] args){
        try {
            File file = new File("ex3.txt");
            Scanner num = new Scanner(System.in);
            System.out.println("请输入：");
            String b = num.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            writer.write(b);
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}