package com.Register;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("unchecked")
public class ReadFile implements PathString {
    List<MemberInfo> memberList = WriteFile.memberList;
    public void readTextFile() {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            memberList = (List<MemberInfo>) ois.readObject();
            ois.close();
            memberList.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
