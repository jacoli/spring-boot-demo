package com.jacoli.DO;

/**
 * Created by lichuange on 2017/7/22.
 */
public enum BillType {
    Income(0, "income"), Expenditure(1, "expenditure");

    private int type;
    private String name;

    BillType(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
