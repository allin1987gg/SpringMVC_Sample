package com.domain.common.util;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zjz on 17/4/6.
 */
public class CommonIntercepter extends HandlerInterceptorAdapter {

    /**
     * Override
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        try {
//
            // URL
            String reqUrl = request.getRequestURL().toString();
//			System.out.println(reqUrl);

//			// TODO 임시 삭제예정
//			if(reqUrl.contains("/tempIndex.do")){
//				return true;
//			}
            // 로그인 Path는 통과
            if(reqUrl.contains("/admin/login") || reqUrl.contains("/admin/loginCall")){
                return true;
            }


//            // HttpSession 세션 취득
//            HttpSession httpSession = request.getSession();
//
//            if (httpSession.getAttribute(CommonConstants.SESSION_USERINFO_KEY) == null) {
//                // 로그인페이지로 redirect
//                response.sendRedirect("/admin/login");
//                return false;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
}