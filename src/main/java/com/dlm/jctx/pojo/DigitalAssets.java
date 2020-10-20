package com.dlm.jctx.pojo;

import java.util.Date;

public class DigitalAssets {
    private Integer id;

    private Integer householdId;

    private Integer householdMemberId;

    private Integer assetsType;

    private Integer orderNum;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public Integer getHouseholdMemberId() {
        return householdMemberId;
    }

    public void setHouseholdMemberId(Integer householdMemberId) {
        this.householdMemberId = householdMemberId;
    }

    public Integer getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(Integer assetsType) {
        this.assetsType = assetsType;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}