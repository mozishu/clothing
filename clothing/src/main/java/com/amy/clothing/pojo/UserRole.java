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
public class UserRole implements Serializable {

    private Integer id;

    private Integer uid;

    private Integer rid;

    private String remarks;

    private Integer deleted;

    private Date createtime;

    private Date updatetime;

}