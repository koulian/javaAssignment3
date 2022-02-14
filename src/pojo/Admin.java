package pojo;

import javax.xml.transform.Result;
import java.util.Scanner;

/**
 * Manager class:
 * login function
 * Query function
 * Querying user information (add, Delete, modify and search)
 * Check customer's reservation and charge
 * Query customer feedback
 */



public class Admin {
   /* private String username="admin";
    private int    password=12345;*/
    /**
     * Administrator Login
     *
     */
    public static void main(String[] args) {
        AdminLogin();
    }


    public static void AdminLogin (){
        MainFunction mainFunction=new MainFunction();

        for (int i = 3; i >= 0; i--) {
            Scanner sc=new Scanner(System.in);
            System.out.println("please enter your Username:");
            String username = sc.nextLine();
            Scanner sc2=new Scanner(System.in);
            System.out.println("please enter your password:");
            int password = sc2.nextInt();
            if (username.equals("admin")&&password==123456){
                System.out.println("welcome admin!");
                mainFunction.AdminMainInterface();
                break;
            }else {
                System.out.println("Incorrect username or password,you have" +i+ "more chance!");
                MainFunction.Menu();
            }
        }
    }
    public static void QueryInf(){

    }
}


