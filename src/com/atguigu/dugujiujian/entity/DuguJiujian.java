package com.atguigu.dugujiujian.entity;

public class DuguJiujian {
    private String movements;

    private String exeWay;

    public DuguJiujian() {
        // TODO Auto-generated constructor stub
    }

    public String getMovements() {
        return movements;
    }

    public void setMovements(String movements) {
        this.movements = movements;
    }

    public String getExeWay() {
        return exeWay;
    }

    public void setExeWay(String exeWay) {
        this.exeWay = exeWay;
    }
    public void exe() {
        System.out.println("无招胜有招!");
    }

}
