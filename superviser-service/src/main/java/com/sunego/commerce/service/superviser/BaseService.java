/**
 * Copyright (c) 2018,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:superviser-service
 * Package Name:com.sunego.commerce.superviser.service
 * File Name:BaseService.java
 * Date:2018年8月23日 下午3:52:30
 * 
 */
package com.sunego.commerce.service.superviser;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * ClassName: BaseService <br/>
 * Description: TODO <br/>
 * Date: 2018年8月23日 下午3:52:30 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */
@Service
public interface BaseService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

}
