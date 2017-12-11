package com.google.simple.model;

/**
 *
 * @author lizhifeng
 * @date 2017/12/5 0005
 */

public class StudentInfo{
    private String name;
    private String age;
    private String avator;

    public StudentInfo(String name, String age, String avator) {
        this.name = name;
        this.age = age;
        this.avator = avator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }
}
