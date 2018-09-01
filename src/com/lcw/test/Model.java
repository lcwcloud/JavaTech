package com.lcw.test;

/**
 * Model Bean Java
 */
public class Model {
    // 身份id
    public String id;
    // 实际年龄
    public int age;
    // 中文姓名
    public String name;
    // 性别
    public String gender;
    // 当前住址
    public String address;
    // 附加信息
    public String comment;

    public Model(){}

    public Model(String id, int age, String name, String gender, String address, String comment) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.comment = comment;
    }
}
