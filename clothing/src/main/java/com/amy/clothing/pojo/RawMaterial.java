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
public class RawMaterial implements Serializable {

    private Integer id;

    private Integer gid;

    private String name;

    private String color;

    private Integer num;

    private String remarks;

    private BigDecimal money;

    private Date buydate;

    private Integer deleted;

    private Date createtime;

    private Date updatetime;

}