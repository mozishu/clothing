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
public class Menu implements Serializable {

    private Integer id;

    private String name;

    private Integer pid;

    private String url;

    private String remarks;

    private Integer deleted;

    private Date createtime;

    private Date updatetime;

}