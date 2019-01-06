package com.supadmin.hotelafter.entity;

public class Users {
    private Integer userid;
    private String usersname;
    private String useridcard;
    private Integer userssex;
    private String price;
    private Integer stat;
    private Integer roomids;
    private String roomtypes;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsersname() {
        return usersname;
    }

    public void setUsersname(String usersname) {
        this.usersname = usersname;
    }

    public String getUseridcard() {
        return useridcard;
    }

    public void setUseridcard(String useridcard) {
        this.useridcard = useridcard;
    }

    public Integer getUserssex() {
        return userssex;
    }

    public void setUserssex(Integer userssex) {
        this.userssex = userssex;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public Integer getRoomids() {
        return roomids;
    }

    public void setRoomids(Integer roomids) {
        this.roomids = roomids;
    }

    public String getRoomtypes() {
        return roomtypes;
    }

    public void setRoomtypes(String roomtypes) {
        this.roomtypes = roomtypes;
    }
}
