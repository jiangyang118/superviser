/**
 * Copyright (c) 2018,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:superviser-dao
 * Package Name:com.sunego.commerce.superviser.entity.system
 * File Name:Admin.java
 * Date:2018年8月23日 下午2:36:11
 * 
 */
package com.sunego.commerce.superviser.entity.system;

import java.util.Date;

import com.sunego.commerce.superviser.entity.BaseEntity;

import lombok.Data;

/**
 * ClassName: Admin <br/>
 * Description: 系统管理员 <br/>
 * Date: 2018年8月23日 下午2:36:11 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */
@Data
public class Admin extends BaseEntity<Long> {

    private static final long serialVersionUID = -8348460874047878712L;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** E-mail */
    private String email;

    /** 姓名 */
    private String name;

    /** 部门 */
    private String department;

    /** 是否启用 */
    private Boolean isEnabled;

    /** 是否锁定 */
    private Boolean isLocked;

    /** 连续登录失败次数 */
    private Integer loginFailureCount;

    /** 锁定日期 */
    private Date lockedDate;

    /** 最后登录日期 */
    private Date loginDate;

    /** 最后登录IP */
    private String loginIp;

    /** 锁定KEY */
    private String lockKey;

}
