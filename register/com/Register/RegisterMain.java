package com.Register;

import java.io.IOException;

public class RegisterMain {
    public static void main(String[] args) {
       RegisterUI registerUI = new RegisterUI();
       while(true) {
           registerUI.input();
       }
    }
}
