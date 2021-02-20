package com.course.example.customadapter;

public class MyData {

    private int serialNum;
    private String name;
    private String mobileNumber;

    //constructors
    public MyData(int num, String name, String mobileNumber) {
        this.serialNum = num;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    //accessors and mutators
    public int getNum() {
        return serialNum;
    }
    public void setNum(int num) {
        this.serialNum = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}