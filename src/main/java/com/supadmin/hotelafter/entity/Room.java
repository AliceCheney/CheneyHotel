package com.supadmin.hotelafter.entity;

public class Room {
   private Integer roomid;
   private String housetype;
   private Integer stat;
   private Integer price;
   private String floor;

    public Room() {
    }

    public Room(Integer roomid, String housetype, Integer stat, Integer price, String floor) {
        this.roomid = roomid;
        this.housetype = housetype;
        this.stat = stat;
        this.price = price;
        this.floor = floor;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
}
