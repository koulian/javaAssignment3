package controller;

import utils.ReadFile;

import java.util.List;

public class Admin {
    public static void ManagerUser(){
        ReadFile rf=new ReadFile();
        List<String> RegFile = rf.readTxtFile("register.txt");
        for (String info : RegFile) {
            System.out.println(info.length());

        }
    }

    public static void main(String[] args) {
        Admin.ManagerUser();
    }


}
