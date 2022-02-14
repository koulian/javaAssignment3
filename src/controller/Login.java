package controller;

import JFrame.MainInterface;
import pojo.User;
import utils.ReadFile;

import java.util.List;

public class Login {

   public static boolean UserLogin(String Type, String Username, String Password) {
      ReadFile rf = new ReadFile();

      List<String> AccountList = rf.readTxtFile("account.txt");
      for (String ss : AccountList) {
         if (ss.trim() != "" && !ss.trim().equals("")) {
            String[] ssArray = ss.split(",");
            String type = ssArray[0];
            String username = ssArray[1];
            String password = ssArray[2];
            if (Type.equals(type) &&
                    Username.equals(username)
                    && Password.equals(password)) {
               return true;
            }


         }
      }
      return false;

   }
}
