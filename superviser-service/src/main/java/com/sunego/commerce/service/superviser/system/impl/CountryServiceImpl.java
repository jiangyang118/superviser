/**
 * Copyright (c) 2018,sunnybs. 
 * All Rights Reserved.
 * 
 * Project Name:superviser-service
 * Package Name:com.sunego.commerce.superviser.service.system.impl
 * File Name:CountryServiceImpl.java
 * Date:2018年8月23日 下午3:51:57
 * 
 */
package com.sunego.commerce.service.superviser.system.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sunego.commerce.service.superviser.BaseServiceImpl;
import com.sunego.commerce.service.superviser.system.CountryService;
import com.sunego.commerce.superviser.entity.system.Country;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

/**
 * ClassName: CountryServiceImpl <br/>
 * Description: TODO <br/>
 * Date: 2018年8月23日 下午3:51:57 <br/>
 * <br/>
 * 
 * @author jiang(邮箱)
 * 
 *         修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

@Service("countryServiceImpl")
public class CountryServiceImpl extends BaseServiceImpl<Country> implements CountryService {

    @Override
    public List<Country> selectByCountry(Country country, int page, int rows) {
        Example example = new Example(Country.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(country.getCountryname())) {
            criteria.andLike("countryname", "%" + country.getCountryname() + "%");
        }
        if (StringUtil.isNotEmpty(country.getCountrycode())) {
            criteria.andLike("countrycode", "%" + country.getCountrycode() + "%");
        }
        if (country.getId() != null) {
            criteria.andEqualTo("id", country.getId());
        }
        // 分页查询
        PageHelper.startPage(page, rows);
        return selectByExample(example);
    }

}
