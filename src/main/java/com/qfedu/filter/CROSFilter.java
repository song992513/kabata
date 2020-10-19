package com.qfedu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * projectName: kabata
 *
 * @author: szc
 * time:2020/10/19 15:45
 * description:实现CROS跨域访问
 */
@WebFilter("/*")
public class CROSFilter implements Filter {
    //过滤
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
