package com.peng.api.domain;

/**
 * @author 彭青松
 * @project xtone-framework
 * @company 成都信通信息技术有限公司
 * @date 2018-12-11 16:02
 * @description 描述当前类的用途
 */
public class UserEntity {
    public String name;
    public int age;
    public String port;

    public UserEntity() {
    }

    public UserEntity(String name, int age, String port) {
        this.name = name;
        this.age = age;
        this.port = port;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", port='" + port + '\'' +
                '}';
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
