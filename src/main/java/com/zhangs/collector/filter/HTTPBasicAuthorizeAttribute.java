package com.zhangs.collector.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhangs.collector.response.Result;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("restriction")
public class HTTPBasicAuthorizeAttribute implements Filter{

    private static String Name = "admin";
    private static String Password=  "admin";

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub

        Result resultStatusCode = checkHTTPBasicAuthorize(request);
        if (!resultStatusCode.isSuccess())
        {
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.setCharacterEncoding("UTF-8");
            httpResponse.setContentType("application/json; charset=utf-8");
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            ObjectMapper mapper = new ObjectMapper();
            httpResponse.getWriter().write(mapper.writeValueAsString(resultStatusCode));
            return;
        }
        else
        {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }

    private Result checkHTTPBasicAuthorize(ServletRequest request)
    {
        try
        {
            HttpServletRequest httpRequest = (HttpServletRequest)request;
            String auth = httpRequest.getHeader("Authorization");
            if ((auth != null) && (auth.length() > 6))
            {
                return Result.success();
            }
            return Result.fail("鉴权失败");
        }
        catch(Exception ex)
        {
            return Result.fail("鉴权失败");
        }

    }


}