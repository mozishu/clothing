package com.amy.clothing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StockPurchase implements Serializable {

    private Integer id;

    private Integer gid;

    private String color;

    private String size;

    private Integer num;

    private Date pulldate;

    private Integer deleted;

    private Date createtime;

    private Date updatetime;

}