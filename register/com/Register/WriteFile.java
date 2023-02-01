package com.Register;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteFile implements PathString {
    Scanner sc = new Scanner(System.in);
    static List<MemberInfo> memberList = new ArrayList<>();

    /*public void inputMemberInfo(MemberInfo info) {
        try {
            FileOutputStream fos = new FileOutputStream(path, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            memberList.add(info);
            oos.writeObject(memberList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public void inputMemberInfo(MemberInfo info) {
        try {
            FileOutputStream fos = new FileOutputStream(path, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            memberList.add(info);
            oos.writeObject(memberList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
