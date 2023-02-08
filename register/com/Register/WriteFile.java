package com.Register;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteFile implements PathString {
    Scanner sc = new Scanner(System.in);
    ArrayList<MemberInfo> memberList = new ArrayList<>();
    public void inputMemberInfo(MemberInfo info) {
        try {
            FileOutputStream fos = new FileOutputStream(path, true);
            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);

            memberList.add(info);
            oos.writeObject(memberList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
