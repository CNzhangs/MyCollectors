package com.zhangs.collector.entities;

import javax.persistence.Entity;

/**
 * 维护正在登陆的用户信息
 */
@Entity
public class LoginUser extends BaseEntity {
    User user;
    String token;
    String islogin;
    long timeout;
}
