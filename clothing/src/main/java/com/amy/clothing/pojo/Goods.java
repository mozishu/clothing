package com.amy.clothing.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer id;
    private String name;
    private String colors;
    private String size;
    private String cloth;
    private String clothno;
    private BigDecimal price;
    private BigDecimal wages;
    private String url;
    private Date selldate;
    private Integer deleted;
    private Date createtime;
    private Date updatetime;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors == null ? null : colors.trim();
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }
    public String getCloth() {
        return cloth;
    }
    public void setCloth(String cloth) {
        this.cloth = cloth == null ? null : cloth.trim();
    }
    public String getClothno() {
        return clothno;
    }
    public void setClothno(String clothno) {
        this.clothno = clothno == null ? null : clothno.trim();
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getWages() {
        return wages;
    }
    public void setWages(BigDecimal wages) {
        this.wages = wages;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
    public Date getSelldate() {
        return selldate;
    }
    public void setSelldate(Date selldate) {
        this.selldate = selldate;
    }
    public Integer getDeleted() {
        return deleted;
    }
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public Date getUpdatetime() {
        return updatetime;
    }
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}