/**
 * Copyright (c) 2018,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:superviser-service
 * Package Name:com.sunego.commerce.superviser.service
 * File Name:BaseServiceImpl.java
 * Date:2018年8月23日 下午3:57:57
 * 
 */
package com.sunego.commerce.service.superviser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.common.Mapper;

/**
 * ClassName: BaseServiceImpl <br/>
 * Description: TODO <br/>
 * Date: 2018年8月23日 下午3:57:57 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

}
