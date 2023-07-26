package com.spring.test5_import;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 16:16
 */
public class Banana {

    private int id;

    public Banana() {
        System.out.println("Banana的构造");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "id=" + id +
                '}';
    }
}
