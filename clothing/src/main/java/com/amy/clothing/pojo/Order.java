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
public class Order implements Serializable {

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

}