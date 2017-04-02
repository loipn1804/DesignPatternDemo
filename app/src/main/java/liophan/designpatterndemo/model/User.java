package liophan.designpatterndemo.model;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since April 02, 2017
 */

public class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private String merge() {
        return "id=" + id + ", name=" + name + ", age=" + age;
    }

    private String change(String name, int add) {
        this.name = name;
        this.age += add;
        return merge();
    }
}
