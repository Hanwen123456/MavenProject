package com.spring.test3_factoryBean;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-26 14:33
 */
public class Pear {

    private int id;

    public Pear() {
        System.out.println("pear的构造");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "id=" + id +
                '}';
    }
}
