package com.yc.bean;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-03 09:38
 */
//enum
public enum  OpType {
    WITHDRAW("withdraw",1),DEPOSITE("deposite",2),TRANSFER("transfer",3);

    private String key;
    private int value;


    OpType(String key,int value){
        this.key=key;
        this.value=value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
