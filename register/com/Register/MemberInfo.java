package com.Register;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MemberInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -9223365651070458532L;
    private String memberId, memberPwd, name, nickname;
    private Date regDate;

    public MemberInfo(String memberId, String memberPwd, String name, String nickname) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.name = name;
        this.nickname = nickname;
        regDate = new Date();
    }

    public MemberInfo() {
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public String getName() {
        return name;
    }

    public String getRegDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(regDate);
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void showMemberInfo() {
        System.out.println("아이디 : " + memberId);
        System.out.println("비밀번호 : " + memberPwd);
        System.out.println("이름 : " + name);
        System.out.println("닉네임 : " + nickname);
        System.out.println("가입 날짜 : " + getRegDate());
    }

    @Override
    public String toString() {
        return memberId + "/" + memberPwd + "/" + name + "/" + nickname + "/" + getRegDate();
    }
}
