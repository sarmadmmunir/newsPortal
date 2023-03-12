package com.project.newsPortal.entity;

public class User {

    enum role{
        Admin, Reporter, Supervisor, Visitor, Member
    }
    role Admin = role.Admin;
    role Reporter = role.Reporter;

    private int iD;

    private String name;

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
