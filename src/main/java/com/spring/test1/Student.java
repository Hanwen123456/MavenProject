package com.spring.test1;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-25 19:22
 */
public class Student {
    private int id;
    private String name;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student() {
        System.out.println("Student 构造了");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }


}
