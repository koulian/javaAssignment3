package pojo;

import java.util.Scanner;

public class MainFunction {
    public static void main(String[] args) {
        Menu();


    }
    /**
     * Menu
     */
    public static void Menu() {
        System.out.println("welcome to APU Hostel Home Appliances Service Centre");
        System.out.println("1.Administrator login!");
        System.out.println("2.User registration");
        System.out.println("3.User login");
        System.out.println("0.Exit");
        System.out.println("please enter your option:");
        Scanner sc=new Scanner(System.in);
        int option = sc.nextInt();
        Admin admin=new Admin();
        switch (option){
            case 1:
                admin.AdminLogin();
                break;
            case 2:
                //用户注册
                break;
            case 3:
                //用户登录
                break;
            case 0:
                Menu();
                break;
            default:
                System.out.println("Invalid information!");
        }
    }

    /**
     * Administrator Main Interface
     */

    public static void AdminMainInterface() {
        System.out.println("welcome to APU Hostel Home Appliances Service Centre");
        System.out.println("1.Querying User Information");
        System.out.println("2.Manage customer reservation information");
        System.out.println("0.Exit");
        System.out.println("please enter your command：");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        switch (command){
            case 1:
                //查询用户信息
                break;
            case 2:
                //管理用户预约信息
                break;
            case 0:
                Menu();
                break;
            default:
                System.out.println("Invalid information!");


        }

    }



}
