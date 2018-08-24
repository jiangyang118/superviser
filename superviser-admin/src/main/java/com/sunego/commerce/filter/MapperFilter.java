package com.sunego.commerce.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.sunego.commerce.superviser.entity.system.Country;
import com.sunego.commerce.superviser.mapper.CountryMapper;

/**
 * @author liuzh
 * @since 2017/10/8.
 */
public class MapperFilter implements Filter {
    @Autowired
    private CountryMapper countryMapper;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        List<Country> countries = countryMapper.selectAll();
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
