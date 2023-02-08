package com.Register;

import java.io.IOException;
import java.util.Scanner;

public class RegisterMain {
    public static void main(String[] args) {
       RegisterUI registerUI = new RegisterUI();
       Scanner sc = new Scanner(System.in);
       while(true) {
           System.out.print("1. 입력, 2. 출력 >> ");
           int menu = sc.nextInt();
           switch (menu) {
               case 1:
                   registerUI.input();
                   break;
               case 2:
                   registerUI.read();
                   break;
               default:
                   System.exit(0);
           }
       }
    }
}
