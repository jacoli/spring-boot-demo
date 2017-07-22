package com.jacoli.DO;

import java.util.Date;

/**
 * Created by lichuange on 2017/7/22.
 */
public class BillRecord {
    private long id;
    private Date created_at;
    private Date modified_at;
    private long user_id;
    private long fee_cent;
    private BillType type;
    private String note;
    private String category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getFee_cent() {
        return fee_cent;
    }

    public void setFee_cent(long fee_cent) {
        this.fee_cent = fee_cent;
    }

    public BillType getType() {
        return type;
    }

    public void setType(BillType type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getModified_at() {
        return modified_at;
    }

    public void setModified_at(Date modified_at) {
        this.modified_at = modified_at;
    }
}
