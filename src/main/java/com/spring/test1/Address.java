package com.spring.test1;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-25 20:12
 */
public class Address {
    private String province;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Address() {
        System.out.println("地址构造了");
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
