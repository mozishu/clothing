package com.amy.clothing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Goods implements Serializable {
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
}