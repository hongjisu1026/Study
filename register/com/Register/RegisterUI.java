package com.Register;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterUI {
    ReadFile readFile = new ReadFile();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 >> ");
        String memberId = sc.nextLine();
        System.out.print("비밀번호 >> ");
        String memberPwd = sc.nextLine();
        System.out.print("이름 >> ");
        String name = sc.nextLine();
        System.out.print("닉네임 >> ");
        String nickname = sc.nextLine();

        WriteFile writeFile = new WriteFile();
        writeFile.inputMemberInfo(new MemberInfo(memberId, memberPwd, name, nickname));
    }

    public void read() {
        readFile.readTextFile();
        ArrayList<MemberInfo> info = readFile.list;
        for(MemberInfo memberInfo : info) {
            memberInfo.showMemberInfo();
        }
    }
}
