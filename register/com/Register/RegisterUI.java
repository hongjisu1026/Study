package com.Register;

import java.util.Scanner;

public class RegisterUI {

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

        ReadFile readFile = new ReadFile();
        readFile.readTextFile();
    }
}
