package com.ohgiraffers.member.run;

import java.util.List;
import java.util.Map;

public class MemberController {

    private final PrintResult printResult;
    private final MemberService memberService;

    public MemberController() {
        printResult=new PrintResult();
        memberService=new MemberService();
    }
    public void selectAllMenu() {
        List<MemberDTO> menuList = memberService.selectAllMember();

        if(menuList != null) {
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }


    }

    public void selectMenuByCode(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        System.out.println("code = " + code);

        MemberDTO member = memberService.selectMemberByCode(code);

        if(member != null) {
            printResult.printMember(member);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registMember(Map<String, String> parameter) {
        String name = parameter.get("name");
        int age=Integer.parseInt(parameter.get("age"));
        String address=parameter.get("address");
        String phoneNum=parameter.get("phoneNum");

        MemberDTO member = new MemberDTO();
        member.setName(name);
        member.setAge(age);
        member.setAddress(address);
        member.setPhoneNum(phoneNum);

        System.out.println("member = " + member);

        if(memberService.insertMember(member)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyMember(Map<String, String> parameter) {
        int memberNo = Integer.parseInt(parameter.get("memberNo"));
        String name = parameter.get("name");
        int age = Integer.parseInt(parameter.get("age"));
        String address=parameter.get("parameter");
        String phoneNum=parameter.get("phoneNum");


        MemberDTO member = new MemberDTO();
        member.setMemberNo(memberNo);
        member.setName(name);
        member.setAge(age);
        member.setAddress(address);
        member.setPhoneNum(phoneNum);

        System.out.println("member = " + member);

        if(memberService.modifyMember(member)){
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMember(Map<String, String> parameter) {
        int memberNo = Integer.parseInt(parameter.get("memberNo"));

        if(memberService.deleteMember(memberNo)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }

    }
}
