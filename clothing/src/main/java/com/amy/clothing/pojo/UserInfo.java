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
public class UserInfo implements Serializable {
    private Integer id;

    private String name;

    private String mobile;

    private Integer sex;

    private Date birthday;

    private String idcard;

    private String address;

    private String url;

    private String username;

    private String password;

    private Integer deleted;

    private Date createtime;

    private Date updatetime;

}