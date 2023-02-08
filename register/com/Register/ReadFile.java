package com.Register;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unchecked")
public class ReadFile implements PathString {
    ArrayList<MemberInfo> list;
    public void readTextFile() {
        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            // MemberInfo readInfo = (MemberInfo) ois.readObject();
            list = (ArrayList<MemberInfo>) ois.readObject();
            // readInfo.showMemberInfo();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
