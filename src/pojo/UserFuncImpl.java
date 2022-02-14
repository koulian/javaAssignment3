package pojo;

import java.io.*;
import java.util.Scanner;

public class UserFuncImpl  implements UserFunc {
    @Override
    public void UserRegister(String NewUserID,String NewUserPassword) {
        try {/*
               Scanner sc1 = new Scanner(System.in);
               System.out.println("Enter the registration ID:");
               String NewUserID = sc1.next();
               Scanner sc2 = new Scanner(System.in);
               System.out.println("Enter the registration password:");
               int NewUserPassword = sc2.nextInt();*/

               File file=new File("register.txt");

               if (!file.exists()) {
                   file.createNewFile();
               }
                   FileWriter fw = new FileWriter(file.getAbsolutePath());
                   BufferedWriter bw = new BufferedWriter(fw);
                   bw.write(NewUserID);
                   bw.newLine();
                   bw.write(NewUserPassword);
                   bw.close();
                   System.out.println("Registered successfully!");

           }
           catch (IOException e) {
               e.printStackTrace();
           }

       }



    public static void main(String[] args) {
         UserFuncImpl u=new UserFuncImpl();
         /*u.UserRegister();*/
    }

}
