package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List readTxtFile(String filePath) {
        List<String> array = new ArrayList<String>();
        try {
            String encoding = "UTF-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()) { //Determine whether the file exists
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);//Consider the encoding format
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
//                    System.out.println(lineTxt);
                    array.add(lineTxt);
                }
                read.close();
            } else {
                System.out.println("The specified file could not be found");
            }
        } catch (Exception e) {
            System.out.println("Error reading file contents");
            e.printStackTrace();
        }
        return array;
    }
}
