package com.ohgiraffers.member.run;

public class MemberDTO {
    private int memberNo;
    private String name;
    private int age;
    private String address;
    private String phoneNum;

    public MemberDTO() {
    }

    public MemberDTO(int memberNo, String name, int age, String address, String phoneNum) {
        this.memberNo = memberNo;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberNo=" + memberNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
