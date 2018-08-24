/**
 * Copyright (c) 2018,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:superviser-dao
 * Package Name:com.sunego.commerce.superviser.entity.system
 * File Name:Country.java
 * Date:2018年8月23日 下午3:39:34
 * 
 */
package com.sunego.commerce.superviser.entity.system;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassName: Country <br/>
 * Description: TODO <br/>
 * Date: 2018年8月23日 下午3:39:34 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

@Table(name = "country")
public class Country {
    /**
     * 主键
     */
    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 名称
     */
    private String countryname;

    /**
     * 代码
     */
    private String countrycode;

    /**
     * 获取主键
     *
     * @return Id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id
     *            主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return countryname - 名称
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * 设置名称
     *
     * @param countryname
     *            名称
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * 获取代码
     *
     * @return countrycode - 代码
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * 设置代码
     *
     * @param countrycode
     *            代码
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}