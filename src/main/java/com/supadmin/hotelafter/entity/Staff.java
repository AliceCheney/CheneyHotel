package com.supadmin.hotelafter.entity;

public class Staff {
    private Integer staffid;
    private String staffname;
    private Integer staffsex;//1为男
    private String stafftel;
    private  String position;
    private Integer stat;//1为在职。

    public Staff() {
    }

    public Staff(Integer staffid, String staffname, Integer staffsex, String stafftel, String position, Integer stat) {
        this.staffid = staffid;
        this.staffname = staffname;
        this.staffsex = staffsex;
        this.stafftel = stafftel;
        this.position = position;
        this.stat = stat;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public Integer getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(Integer staffsex) {
        this.staffsex = staffsex;
    }

    public String getStafftel() {
        return stafftel;
    }

    public void setStafftel(String stafftel) {
        this.stafftel = stafftel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }
}
