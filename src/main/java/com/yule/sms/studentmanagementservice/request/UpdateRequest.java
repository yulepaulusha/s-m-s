package com.yule.sms.studentmanagementservice.request;

/**
 * Created by Yule.Paulusha on 4/19/2019.
 */
public class UpdateRequest {
    private int id;
    private String name;

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
}
