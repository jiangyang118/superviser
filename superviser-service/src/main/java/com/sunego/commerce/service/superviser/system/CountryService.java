/**
 * Copyright (c) 2018,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:superviser-service
 * Package Name:com.sunego.commerce.superviser.service.system
 * File Name:CountryService.java
 * Date:2018年8月23日 下午3:51:42
 * 
 */
package com.sunego.commerce.service.superviser.system;

import java.util.List;

import com.sunego.commerce.service.superviser.BaseService;
import com.sunego.commerce.superviser.entity.system.Country;

/**
 * ClassName: CountryService <br/>
 * Description: TODO <br/>
 * Date: 2018年8月23日 下午3:51:42 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public interface CountryService extends BaseService<Country> {

    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<Country> selectByCountry(Country country, int page, int rows);

}
