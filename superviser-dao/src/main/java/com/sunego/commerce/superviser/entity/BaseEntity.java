/**
 * Copyright (c) 2018,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:superviser-dao
 * Package Name:com.sunego.commerce.superviser.entity
 * File Name:BaseEntity.java
 * Date:2018年8月23日 下午2:28:42
 * 
 */
package com.sunego.commerce.superviser.entity;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: BaseEntity <br/>
 * Description: 基类 <br/>
 * Date: 2018年8月23日 下午2:28:42 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public abstract class BaseEntity<ID extends Serializable> implements Serializable {

    private static final long serialVersionUID = -2897922628411529230L;

    /** "ID"属性名称 */
    public static final String ID_PROPERTY_NAME = "id";

    /** "创建日期"属性名称 */
    public static final String CREATE_DATE_PROPERTY_NAME = "createDate";

    /** "修改日期"属性名称 */
    public static final String MODIFY_DATE_PROPERTY_NAME = "modifyDate";

    /** "版本"属性名称 */
    public static final String VERSION_PROPERTY_NAME = "version";

    /** ID */
    private ID id;

    /** 创建日期 */
    private Date createDate;

    /** 修改日期 */
    private Date modifyDate;

    /** 版本 */
    private Long version;

    /**
     * 获取ID
     * 
     * @return ID
     */
    public ID getId() {
        return id;
    }

    /**
     * 设置ID
     * 
     * @param id
     *            ID
     */
    public void setId(ID id) {
        this.id = id;
    }

    /**
     * 获取创建日期
     * 
     * @return 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     * 
     * @param createDate
     *            创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改日期
     * 
     * @return 修改日期
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置修改日期
     * 
     * @param modifyDate
     *            修改日期
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 获取版本
     * 
     * @return 版本
     */
    public Long getVersion() {
        return version;
    }

    /**
     * 设置版本
     * 
     * @param version
     *            版本
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 判断是否为新建对象
     * 
     * @return 是否为新建对象
     */
    @Transient
    public boolean isNew() {
        return getId() == null;
    }

    /**
     * 重写toString方法
     * 
     * @return 字符串
     */
    @Override
    public String toString() {
        return String.format("Entity of type %s with id: %s", getClass().getName(), getId());
    }

    /**
     * 重写equals方法
     * 
     * @param obj
     *            对象
     * @return 是否相等
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!BaseEntity.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        BaseEntity<?> other = (BaseEntity<?>) obj;
        return getId() != null ? getId().equals(other.getId()) : false;
    }

    /**
     * 重写hashCode方法
     * 
     * @return HashCode
     */
    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode += getId() != null ? getId().hashCode() * 31 : 0;
        return hashCode;
    }
}
