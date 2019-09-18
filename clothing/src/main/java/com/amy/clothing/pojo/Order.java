package com.amy.clothing.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {

    private Integer id;

    private Integer gid;

    private String customer;

    private String mobile;

    private Integer num;


    private Integer isreserve;

    private BigDecimal price;

    private BigDecimal owemoney;

    private Date pricedate;

    private Date transactiondate;


    private Integer deleted;

    private Date cretaetime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }


    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getIsreserve() {
        return isreserve;
    }

    public void setIsreserve(Integer isreserve) {
        this.isreserve = isreserve;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOwemoney() {
        return owemoney;
    }

    public void setOwemoney(BigDecimal owemoney) {
        this.owemoney = owemoney;
    }

    public Date getPricedate() {
        return pricedate;
    }

    public void setPricedate(Date pricedate) {
        this.pricedate = pricedate;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }


    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCretaetime() {
        return cretaetime;
    }

    public void setCretaetime(Date cretaetime) {
        this.cretaetime = cretaetime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}