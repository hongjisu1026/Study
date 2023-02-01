package com.Register;

import java.util.ArrayList;
import java.util.List;

public class Register {
    ReadFile readFile = new ReadFile();
    WriteFile writeFile = new WriteFile();
    List<MemberInfo> memberList = WriteFile.memberList;

    public void register(String memberId, String memberPwd, String name, String nickname) {
        boolean isMemberId = duplicateMemberId(memberId);
        boolean isNickname = duplicateNickname(nickname);

        if(!isMemberId) {
            System.out.println("이미 사용중인 아이디 입니다.");
        } else if(!isNickname) {
            System.out.println("이미 사용중인 닉네임 입니다.");
        } else {
            // writeFile.inputMemberInfo(new MemberInfo(memberId, memberPwd, name, nickname));
        }
    }

    public void login(String memberId, String memberPwd) {
        boolean isMemberId = checkMemberId(memberId);
        boolean isMemberPwd = checkMemberPwd(memberPwd);

        if(isMemberId && isMemberPwd) {
            printMemberInfo(memberId);
        } else if(isMemberId && isMemberPwd == false) {
            System.out.println("일치하지 않는 비밀번호를 입력하셨습니다.");
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
        }
    }

    //아이디 찾기
    public void findMemberId(String name) {
        for(MemberInfo info : memberList) {
            if(info.getName().compareTo(name) == 0) {
                System.out.println("아이디 : " + info.getMemberId());
                break;
            }
        }
    }

    //비밀번호 찾기
    public void findMemberPwd(String memberId, String name) {
        for(MemberInfo i : memberList) {
            int isMemberId = i.getMemberId().compareTo(memberId);
            int isName = i.getName().compareTo(name);
            if(isMemberId == 0 && isName == 0) {
                System.out.println("비밀번호 : " + i.getMemberPwd());
            }
        }
    }

    //아이디 중복 체크
    public boolean duplicateMemberId(String memberId) {
        for(MemberInfo i : memberList) {
            if(i.getMemberId().compareTo(memberId) == 0) {
                return false;
            }
        }
        return true;
    }

    //닉네임 중복 체크
    public boolean duplicateNickname(String nickname) {
        for(MemberInfo i : memberList) {
            if(i.getNickname().compareTo(nickname) == 0) {
                return false;
            }
        }
        return true;
    }

    //(로그인 시) 아이디 확인
    public boolean checkMemberId(String memberId) {
        for(MemberInfo i : memberList) {
            if(i.getMemberId().compareTo(memberId) == 0) {
                return true;
            }
        }
        return false;
    }

    //(로그인 시) 비밀번호 확인
    public boolean checkMemberPwd(String memberPwd) {
        for(MemberInfo i : memberList) {
            if(i.getMemberPwd().compareTo(memberPwd) == 0) {
                return true;
            }
        }
        return false;
    }

    // 회원 정보 출력
    public void printMemberInfo(String memberId) {
        for(MemberInfo i : memberList) {
            if(i.getMemberId().compareTo(memberId) == 0) {
                i.showMemberInfo();
            }
        }
    }
}
