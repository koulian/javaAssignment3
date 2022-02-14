package pojo;



import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

public class FileFunc {

    public static void main(String[] args) {

        try {
            String content = "a dog will be write in file";
            File file = new File("test_appendfile2.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(content);
            bw.close();
            System.out.println("finish");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
