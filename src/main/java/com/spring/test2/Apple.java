package com.spring.test2;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-25 20:35
 */
public class Apple {

    private int id;

    public Apple() {
        System.out.println("apple的构造");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                '}';
    }
}
