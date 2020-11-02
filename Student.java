package com;

public class Student
{
    private  int age;
    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initmethod()
    {
        this.name="milo";
        this.age=18;
        System.out.println("对象初始化时会调用的方法..");
    }

    public void destroyMethod()
    {

        System.out.println("对象被销毁的时候调用的方法....");
    }
}
